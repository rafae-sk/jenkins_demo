def roleType = ['ops','admin','audit']

pipelineJob ('sample-pipeline1'){
    description('Sample pipeline job for demo')
    logRotator(5,5)
    parameters {
        choiceParam('role_type', roleType)
    }
}