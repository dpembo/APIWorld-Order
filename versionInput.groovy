
if(env.GIT_BRANCH!="development")
{
    userInput = input(
    id: 'Version Required', message: 'Please provide version number', parameters: [
    [$class: 'StringParameterDefinition', defaultValue: "0.0.0", description: '', name: 'Version Number']
    ])
}
else
{
    userInput="ci"
}
env.VERSION=userInput

//build.setDisplayName("ReleaseBuild v" + userInput)