node {

    withMaven(maven:'mvn3.5.3') {

        stage('Checkout') {
            git url: 'https://github.com/salvitas/product-service.git', branch: 'develop'
        }

        stage('Build') {
            sh 'mvn clean install'

            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }



    }

}