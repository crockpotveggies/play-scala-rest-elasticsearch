# Play Scala Elasticsearch Rest with KOPF Plugin and Docker

## 1) Run Elastic Search
    `$ ./docker/elasticsearch/run_dockers_.sh`

## 2) Run Play project
    `$ ./conf/schema-update/book_index.sh` (only the first time)
    `$ cd docker/elasticsearch/`
    `$ ./run_dockers.sh`
    `$ sbt run` (in the root folder)

## 3) Relevant Url's
    Play REST Web Interface: http://localhost:9000/es/stats
    Activator UI: http://127.0.0.1:8888/app/play-scala-rest-elasticsearch-1/#tutorial 
    ES KOPF PlugIn: http://localhost:9200/_plugin/kopf/#!/cluster
    
## Pitfalls 
    I assume you run docker WITHOUT SUDO
    You need docker, docker-compose, activator and sbt to run this project (maybe I will provide a installer in the future)
