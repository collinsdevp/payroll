FROM openjdk:8
EXPOSE 8080
ADD target/company_payroll-0.0.1-SNAPSHOT.jar company_payroll-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","company_payroll-0.0.1-SNAPSHOT.jar"]