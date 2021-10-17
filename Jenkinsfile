node{
stage('拉取代码'){
checkout([$class: 'GitSCM', branches: [[name: "*/${branch}"]], extensions: [], userRemoteConfigs: [[credentialsId: '792da32e-fb27-4766-b636-8351d574f6d4', url: 'https://github.com/SnakeMiss/guli_parent.git']]])
}
}