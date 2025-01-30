help:
	@grep -E '^[^:]+:.*?## .*$$' $(MAKEFILE_LIST) | grep -v grep | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}' | sort

mutant-tests: ## run mutation tests 
	mvn test-compile org.pitest:pitest-maven:mutationCoverage

mutant-report: ## show mutation tests report
	firefox target/pit-reports/

coverage: ## run coverage tests 
	mvn clean test jacoco:report

coverage-report: ## show coverage tests report
	firefox target/site/jacoco/index.html
