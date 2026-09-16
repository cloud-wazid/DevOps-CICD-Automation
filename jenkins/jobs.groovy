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
            scriptPath('jenkins/build.Jenkinsfile')
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
            scriptPath('jenkins/test.Jenkinsfile')
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
            scriptPath('jenkins/deploy.Jenkinsfile')
        }
    }
}