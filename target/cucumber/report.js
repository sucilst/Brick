$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@sequence"
    }
  ]
});
formatter.background({
  "name": ": Register Success",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User open the Register page",
  "keyword": "Given "
});
formatter.match({
  "location": "Register.userOpenTheRegisPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do Register",
  "keyword": "When "
});
formatter.match({
  "location": "Register.doRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Register",
  "keyword": "And "
});
formatter.match({
  "location": "Register.clickRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Register Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.registerSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@sequence"
    }
  ]
});
formatter.step({
  "name": "User open the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.userOpenTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do Login",
  "keyword": "When "
});
formatter.match({
  "location": "Login.doLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.loginSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("features/Register.feature");
formatter.feature({
  "name": "Register",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Register"
    },
    {
      "name": "@sequence"
    }
  ]
});
formatter.scenario({
  "name": "Register Success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    },
    {
      "name": "@sequence"
    }
  ]
});
formatter.step({
  "name": "User open the Register page",
  "keyword": "Given "
});
formatter.match({
  "location": "Register.userOpenTheRegisPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do Register",
  "keyword": "When "
});
formatter.match({
  "location": "Register.doRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Register",
  "keyword": "And "
});
formatter.match({
  "location": "Register.clickRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Register Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.registerSuccess()"
});
formatter.result({
  "status": "passed"
});
});