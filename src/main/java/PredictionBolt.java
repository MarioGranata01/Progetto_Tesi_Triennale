import org.apache.storm.task.ShellBolt;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.IRichBolt;
import org.apache.storm.tuple.Fields;

import java.util.Map;

public class PredictionBolt extends ShellBolt implements IRichBolt {

    public PredictionBolt() {
        // Configura l'interprete Python e il percorso dello script Python
        super("C:\\Users\\Utente\\AppData\\Local\\Programs\\Python\\Python312\\python.exe", "C:\\Users\\Utente\\PycharmProjects\\ProvaTesi\\PythonBolt.py");
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("prediction"));
    }

    @Override
    public Map<String, Object> getComponentConfiguration() {
        return null;
    }

}