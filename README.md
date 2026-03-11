# Real-Time Network Intrusion Detection System (NIDS) using Apache Storm

## 🎓 Academic Overview
[cite_start]This project represents my **Bachelor's Thesis in Computer Engineering** (Laurea Triennale) at the **University of Calabria (UNICAL)**[cite: 77, 78, 80, 81]. [cite_start]The core objective was to design and implement a scalable, robust, and real-time system capable of detecting cyber threats and unauthorized access within large-scale network infrastructures[cite: 76, 134, 137, 139].

## 📝 Project Summary
[cite_start]The system leverages the power of **Big Data** (Volume, Variety, Velocity) and **Machine Learning** to provide instantaneous responses to network vulnerabilities[cite: 85, 115, 116, 117, 118, 120]. [cite_start]By integrating **Apache Storm**, the application processes massive data streams in real-time, identifying malicious activities through streaming analysis[cite: 113, 114, 119, 137].

### Key Goals:
* [cite_start]**Machine Learning Training**: Developing models to classify network traffic (Supervised, Unsupervised, and Semi-Supervised learning)[cite: 89, 90, 91, 135].
* [cite_start]**Real-Time Prediction**: Using trained models to categorize live data packets and detect attacks[cite: 136, 137, 140, 144].
* [cite_start]**Scalability**: Ensuring the architecture is robust and capable of handling significant data amounts[cite: 138, 139].

## 🛠️ Architecture & Tech Stack
[cite_start]The project follows a distributed stream processing paradigm based on the Apache Storm architecture[cite: 121, 128].

* [cite_start]**Framework**: Apache Storm (Nimbus, Supervisor, Worker Nodes)[cite: 121, 123, 125].
* [cite_start]**Languages**: **Java** (Core Topology) and **Python** (Machine Learning logic)[cite: 141, 143, 145].
* [cite_start]**ML Approach**: Classification of network attacks such as Neptune, Smurf, and Teardrop[cite: 152, 153].

### System Components:
* [cite_start]**Topology.java**: The engine that starts the application and manages the workflow[cite: 145, 146].
* [cite_start]**Spout.java**: Reads raw data and emits tuples to the bolts[cite: 147, 148, 149].
* [cite_start]**PythonBolt.py / PredictionBolt.java**: Executes Python scripts to perform real-time ML predictions[cite: 143, 144, 149, 150].
* [cite_start]**PrintBolt.java**: Final stage for displaying the prediction results[cite: 151, 152].

## 📊 Performance & Results
[cite_start]The model was evaluated using a detailed classification report, achieving high performance metrics[cite: 153, 154].

* [cite_start]**Metrics**: High levels of **Accuracy**, **Precision**, and **F1-Score**[cite: 155, 157, 159].
* [cite_start]**Detection Capability**: Successful identification of specific attacks like Neptune, Smurf, and IPsweep with 1.00 precision[cite: 152, 153].

---
[cite_start]**Candidate**: Franco Mario Granata [cite: 80, 81]  
[cite_start]**Supervisor**: Dr. Riccardo Cantini [cite: 82, 83]  
[cite_start]**Institution**: University of Calabria - DIMES [cite: 29, 81]
