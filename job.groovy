job('Hello') {
       scm {
               git('https://github.com/nitinakula/IAC-Jenkins.git')
       }
         steps {
                shell('echo "Hello, World!"')
                shell('./hello.sh')
