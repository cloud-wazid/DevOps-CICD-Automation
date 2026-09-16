pipelineJob('DevOps-CICD-Build') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/cloud-wazid/DevOps-CICD-Automation')
                    }
                    branch('*/main')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('DevOps-CICD-Test') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/cloud-wazid/DevOps-CICD-Automation')
                    }
                    branch('*/main')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('DevOps-CICD-Deploy') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/cloud-wazid/DevOps-CICD-Automation')
                    }
                    branch('*/main')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}