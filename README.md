# Real-Time Network Intrusion Detection System (NIDS) using Apache Storm

## 🎓 Academic Overview
This project represents my **Bachelor's Thesis in Computer Engineering** (Laurea Triennale) at the **University of Calabria (UNICAL)**. The core objective was to design and implement a scalable, robust, and real-time system capable of detecting cyber threats and unauthorized access within large-scale network infrastructures.

## 📝 Project Summary
The system leverages the power of **Big Data** (Volume, Variety, Velocity) and **Machine Learning** to provide instantaneous responses to network vulnerabilities. By integrating **Apache Storm**, the application processes massive data streams in real-time, identifying malicious activities through streaming analysis.

### Key Goals:
* **Machine Learning Training**: Developing models to classify network traffic using Supervised and Unsupervised learning.
* **Real-Time Prediction**: Using trained models to categorize live data packets and detect attacks.
* **Scalability**: Ensuring the architecture is robust and capable of handling significant data amounts.

## 🛠️ Architecture & Tech Stack
The project follows a distributed stream processing paradigm based on the Apache Storm architecture.

* **Framework**: Apache Storm (Nimbus, Supervisor, Worker Nodes).
* **Languages**: **Java** (Core Topology) and **Python** (Machine Learning logic).
* **ML Approach**: Classification of network attacks such as Neptune, Smurf, and Teardrop.

### System Components:
* **Topology.java**: The engine that starts the application and manages the workflow.
* **Spout.java**: Reads raw data and emits tuples to the bolts.
* **PythonBolt.py / PredictionBolt.java**: Executes Python scripts to perform real-time ML predictions.
* **PrintBolt.java**: Final stage for displaying the prediction results.

## 📊 Performance & Results
The model was evaluated using a detailed classification report, achieving high performance metrics.

* **Metrics**: High levels of **Accuracy**, **Precision**, and **F1-Score**.
* **Detection Capability**: Successful identification of specific attacks like Neptune, Smurf, and IPsweep with 1.00 precision.

---
**Candidate**: Franco Mario Granata  
**Supervisor**: Dr. Riccardo Cantini  
**Institution**: University of Calabria - DIMES
