pipeline {
    agent any

    parameters {
        choice(
            name:'compileTool',
            choices: ['Maven', 'Gradle'],
            description: 'Selecciona herramienta de compilacion'
        )
    }

    stages {
        stage('pipeline') {
            steps {
                script {

                    // params.compileTool
                    sh "env"
                    switch(params.compileTool)
                    {
                        case 'Maven':
                        echo "Maven"
                            def ejecucion = load 'maven.groovy'
                            ejecucion.call()
                        break;
                        case 'Gradle':
                            def ejecucion = load 'gradle.groovy'
                            ejecucion.call()
                        break;
                    }
                }
            }
        }
    }
}
