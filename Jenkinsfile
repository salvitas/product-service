def gitUrl = 'git@github.com:salvitas/product-service.git'

node {
    withEnv(["JAVA_HOME=${ tool 'JDK8u172' }", "PATH+MAVEN=${tool 'mvn3.5.3'}/bin:${env.JAVA_HOME}/bin"]) {

        stage('Checkout') {
            echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            git url: gitUrl, credentialsId: 'salvitas', branch: 'develop'
        }

        stage('Build') {
            sh "mvn -e -DskipTests clean package"
        }

        stage('Test') {
            sh "mvn -e test"
        }

        stage('Release') {
            #sh "mvn jgitflow:release-start"
            #sh "mvn jgitflow:release-finish"
        }
    }

}