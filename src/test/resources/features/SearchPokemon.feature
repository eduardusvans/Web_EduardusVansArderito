@Web
  Feature: Search Pokemon Name
    @Pikachu
    Scenario: Search pokemon named Pikachu
      Given User open bulbapedia homepage
      When User input search "Pikachu" on hompage
      Then User see article with title "Pikachu" and Number "#025" on article page

    @Bulbasaur
    Scenario: Search pokemon named Bulbasaur
      Given User open bulbapedia homepage
      When User input search "Bulbasaur" on hompage
      Then User see article with title "Bulbasaur" and Number "#001" on article page

    @Charizard
    Scenario: Search pokemon named Charizard
      Given User open bulbapedia homepage
      When User input search "Charizard" on hompage
      Then User see article with title "Charizard" and Number "#006" on article page