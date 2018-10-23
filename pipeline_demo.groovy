def roleType = ['ops','admin','audit']

pipelinejob (sample-pipeline){
    description('Sample pipeline job for demo')
    logRotators(5,5)
    parameters {
        choiceParam('role_type', roleType)
    }
}