Feature: validate to book the ticket

  Scenario Outline: validate flight booking
    Given initialize application on chrome browser
    When enter a valid information on "<departure>" to "<destination>"
    And click find flight
    And click the selective flight
    And enter the name "<username>" and address "<Adress>" and city "<city>" and state "<state>" and zipcode <zipcode> and cardtype "<cardtype>" and cresditcard <cresditcard> and month <month> and year <year> and name of the card "<name of the card>"
    Then validate to purchase flight

    Examples: 
      | departure city | destination | username  | Adress    | city            | state     | zipcode | cardtype  | cresditcard | month    | year | name of the card |
      | portland       | London      | balaji rb | bangalore | electronic city | bangalore |  606303 | Visa      | 87544688    |    07    | 1998 | balaji visa      |
