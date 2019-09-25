$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PMT_Add_Partdescription.feature");
formatter.feature({
  "line": 1,
  "name": "PMT Add Product List",
  "description": "Description: User will add part description for that part#",
  "id": "pmt-add-product-list",
  "keyword": "Feature"
});
formatter.before({
  "duration": 21914804400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Editing part description Test case",
  "description": "",
  "id": "pmt-add-product-list;editing-part-description-test-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@partdesc"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User will go to parts page and search for the part# to edit",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User will click on part description frame and will edit the notes \u0026 saved",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User will see successfull alert and verify the record should be edited",
  "keyword": "Then "
});
formatter.match({
  "location": "TC005_PMT_Partdesc.user_will_go_to_parts_page_and_search_for_the_part_to_edit()"
});
formatter.result({
  "duration": 4558520800,
  "status": "passed"
});
formatter.match({
  "location": "TC005_PMT_Partdesc.user_will_click_on_part_description_frame_and_will_edit_the_notes_saved()"
});
formatter.result({
  "duration": 8889980500,
  "status": "passed"
});
formatter.match({
  "location": "TC005_PMT_Partdesc.user_will_see_successfull_alert_and_verify_the_record_should_be_edited()"
});
formatter.result({
  "duration": 3018045100,
  "status": "passed"
});
formatter.after({
  "duration": 1265165400,
  "status": "passed"
});
});