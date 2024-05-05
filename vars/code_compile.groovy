def code_compile()
{
  sh 'pwd'
  sh 'go version'
  sh 'go build'
  sh 'pwd'
}
