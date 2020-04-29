@Web
  Feature: Search Pokemon Name

    Scenario: Search pokemon named Pikachu
      Given User open bulbapedia homepage
      When User input search "Pikachu" on hompage
      Then User see article with title "Pikachu" on article page

    Scenario: Search pokemon named Bulbasaur
      Given User open bulbapedia homepage
      When User input search "Bulabasaur" on hompage
      Then User see article with title "Bulbasaur" on article page

    Scenario: Search pokemon named Raichu
      Given User open bulbapedia homepage
      When User input search "Raichu" on hompage
      Then User see article with title "Raichu" on article page