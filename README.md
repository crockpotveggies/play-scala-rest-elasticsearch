# Play Scala Elasticsearch Rest with KOPF Plugin and Docker

## 1) Run Elastic Search
    `$ ./docker/elasticsearch/run_dockers_.sh`

## 2) Run Play project
    `$ ./conf/schema-update/book_index.sh` (only the first time)
    `$ sbt run` (in the root folder)
    
## 3) Create a Elastic Search Index
    curl -X POST localhost:9000/es/index
    
## 4) Post To populate some data to ES
    curl -XPOST localhost:9000/books/populate
    or using the KOPF plug in REST
    http://localhost:9200/_plugin/kopf/#!/rest

## 5) Relevant Url's
    Data introduced on ES: http://localhost:9000/books?q=isbn:*
    Play REST Web Interface: http://localhost:9000/es/stats
    Activator UI: http://127.0.0.1:8888/app/play-scala-rest-elasticsearch-1/#tutorial 
    ES KOPF PlugIn: http://localhost:9200/_plugin/kopf/#!/cluster
    
## Pitfalls 
    I assume you run docker WITHOUT SUDO
    You need docker, docker-compose, activator and sbt to run this project (maybe I will provide a installer in the future)
    Read the tutorial of the example used:
    http://127.0.0.1:8888/app/play-scala-rest-elasticsearch-1/#tutorial/0
