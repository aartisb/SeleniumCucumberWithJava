#Author
#Date

Feature: test Sitelaunch feature

  Scenario: Verify Dog Sub Category Product Add to Cart and proceed till checkout
    When User launch browser
    Then User click on Menulist
    Then User click on first sub-category option as Dogs
    Then User click on Food and Treats option
    Then User click on Product and Product details page gets open
    Then User click on Addto Cart button on Product details page
    Then User click on checkout button after adding product to cart
           