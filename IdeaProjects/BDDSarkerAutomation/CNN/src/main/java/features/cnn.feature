Feature: user is in home page

  Background: user search elements
    Given user is in home page

  Scenario:
    When user clicks on Opinion button
    Then user will see Opinion text


  Scenario:
    Then user clicks on Travel button
    And user clicks on Destination button
    When user clicks on Brazil Button
    Then user will see the Brazil text


  Scenario:
    Then user clicks on Travel button
    And user clicks on Destination button
    When user clicks on Tokyo Link
    Then user will see Tokyo text


  Scenario:
    Then user clicks on Travel button
    And user clicks on Destination button
    When user clicks on Abu Dhabi Link
    Then user will see Abu Dhabi text


  Scenario:
    Then user click on live Tv Button
    When user click on live Tv play Button
    Then user would see pop up window


  Scenario:
    Then click on user id Icon
    And user write user email
    And user write user password
    When user click on password Eye button
    Then user see the password


  Scenario:
    Then user scroll down to photos link
    When user click on photos link
    Then user see photos page


  Scenario:
    Then user scroll down to Europe link
    When user click on europe link
    Then user see Europe Text

  @SmokeTest
  Scenario:
    Then user scroll down to Australia link
    When user click on Australia link
    Then user see Australia Text
