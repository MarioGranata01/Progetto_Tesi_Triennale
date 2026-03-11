import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Spout extends BaseRichSpout {

    private SpoutOutputCollector collector;
    private BufferedReader br;
    private boolean completed = false;

    @Override
    public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
        this.collector = collector;

        File file = new File("C:\\Users\\Utente\\IdeaProjects\\TesiCorretto\\Prova.txt");
        if (!file.exists()) {
            System.err.println("File does not exist: " + file.getAbsolutePath());
            throw new RuntimeException("File does not exist: " + file.getAbsolutePath());
        }
        try {
            br = new BufferedReader(new FileReader(file));
            System.out.println("File opened successfully: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error opening file: " + e.getMessage());
            throw new RuntimeException("Error opening file: " + e.getMessage(), e);
        }
    }

    @Override
    public void nextTuple() {
        if (completed) {
            return;
        }
        try {
            String line = br.readLine();
            if (line != null) {
                String[] values = line.split(",");
                if (values.length != 42) {
                    System.err.println("error: " + line);
                    return; // Gestione del caso di valori insufficienti
                }
                Values tupleValues = new Values();
                for (int i = 0; i < values.length - 1; i++) {
                    tupleValues.add(values[i].trim());
                }
                // Emissione tupla contenente tutti i valori eccetto l'ultimo
                collector.emit(tupleValues);
            } else {
                br.close();
                completed = true;
            }
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
            completed = true;
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioException) {
                System.err.println("Errore nella chiusura del file: " + ioException.getMessage());
            }
        }
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields(
                "duration", "protocol_type", "service", "flag", "land", "src_bytes", "dst_bytes",
                "wrong_fragment", "urgent", "hot", "num_failed_logins", "logged_in",
                "num_compromised", "root_shell", "su_attempted", "num_root",
                "num_file_creations", "num_shells", "num_access_files", "num_outbound_cmds",
                "is_host_login", "is_guest_login", "count", "srv_count", "serror_rate",
                "srv_serror_rate", "rerror_rate", "srv_rerror_rate", "same_srv_rate",
                "diff_srv_rate", "srv_diff_host_rate", "dst_host_count", "dst_host_srv_count",
                "dst_host_same_srv_rate", "dst_host_diff_srv_rate", "dst_host_same_src_port_rate",
                "dst_host_srv_diff_host_rate", "dst_host_serror_rate", "dst_host_srv_serror_rate",
                "dst_host_rerror_rate", "dst_host_srv_rerror_rate"
        ));
    }

    @Override
    public void close() {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                System.err.println("Errore nella chiusura del file: " + e.getMessage());
                throw new RuntimeException("Errore nella chiusura del file", e);
            }
        }
    }
}
