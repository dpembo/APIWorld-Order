set username=Administrator
set password=manage
set url=http://localhost:5555
set apiID=c4a73e2e-922b-4624-86f4-7ce7ed10973d
set file=.\microgateway\Order.zip

curl -u %username%:%password% %url%/rest/apigateway/archive?apis=%apiID% --output %file%