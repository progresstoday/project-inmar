$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PageLoadTime.feature");
formatter.feature({
  "line": 1,
  "name": "Registration form feature",
  "description": "",
  "id": "registration-form-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "\u003cTC_No\u003e Registration Form",
  "description": "",
  "id": "registration-form-feature;\u003ctc-no\u003e-registration-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "measure load time of application",
  "keyword": "Given "
});
formatter.examples({
  "line": 6,
  "name": "",
  "description": "",
  "id": "registration-form-feature;\u003ctc-no\u003e-registration-form;",
  "rows": [
    {
      "cells": [
        "TC_No"
      ],
      "line": 7,
      "id": "registration-form-feature;\u003ctc-no\u003e-registration-form;;1"
    },
    {
      "cells": [
        "TC01_Chrome_Browser"
      ],
      "line": 8,
      "id": "registration-form-feature;\u003ctc-no\u003e-registration-form;;2"
    },
    {
      "cells": [
        "TC01_IE_Browser"
      ],
      "line": 9,
      "id": "registration-form-feature;\u003ctc-no\u003e-registration-form;;3"
    },
    {
      "cells": [
        "TC01_PhantomJS_Browser"
      ],
      "line": 10,
      "id": "registration-form-feature;\u003ctc-no\u003e-registration-form;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4726894117,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "TC01_Chrome_Browser Registration Form",
  "description": "",
  "id": "registration-form-feature;\u003ctc-no\u003e-registration-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "measure load time of application",
  "keyword": "Given "
});
formatter.match({
  "location": "PageLoadTimeSteps.launchApplication()"
});
formatter.result({
  "duration": 8509606794,
  "status": "passed"
});
formatter.after({
  "duration": 1336101506,
  "status": "passed"
});
formatter.before({
  "duration": 2637573544,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "TC01_IE_Browser Registration Form",
  "description": "",
  "id": "registration-form-feature;\u003ctc-no\u003e-registration-form;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "measure load time of application",
  "keyword": "Given "
});
formatter.match({
  "location": "PageLoadTimeSteps.launchApplication()"
});
formatter.result({
  "duration": 1585991819,
  "status": "passed"
});
formatter.after({
  "duration": 528607428,
  "status": "passed"
});
formatter.before({
  "duration": 2256098123,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "TC01_PhantomJS_Browser Registration Form",
  "description": "",
  "id": "registration-form-feature;\u003ctc-no\u003e-registration-form;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "measure load time of application",
  "keyword": "Given "
});
formatter.match({
  "location": "PageLoadTimeSteps.launchApplication()"
});
formatter.result({
  "duration": 3576358216,
  "status": "passed"
});
formatter.after({
  "duration": 539177432,
  "status": "passed"
});
});