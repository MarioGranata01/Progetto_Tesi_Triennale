import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.utils.Utils;

public class Topology {

    public static void main(String[] args) throws Exception {
        TopologyBuilder builder = new TopologyBuilder();

        // Spout
        builder.setSpout("spout", new Spout());
        // Bolt per eseguire lo script Python
        builder.setBolt("prediction-bolt", new PredictionBolt()).shuffleGrouping("spout");
        // Bolt per stampare i messaggi
        builder.setBolt("print-bolt", new PrintBolt()).shuffleGrouping("prediction-bolt");

        // Configurazione
        Config config = new Config();
        config.setDebug(false);
        LocalCluster cluster = new LocalCluster();
        cluster.submitTopology("test-topology", config, builder.createTopology());
        // Attendi per un po' prima di fermare la topologia
        Utils.sleep(60000);
        // Arresta la topologia
        cluster.killTopology("test-topology");
        cluster.shutdown();
    }
}
