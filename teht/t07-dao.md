# Tehtävä 7 - DAO

## DAO-luokka
* Tee sovellukseesi uusi pakkaus dao ja sen sisään uusi Java-luokka PizzaDAO
* Ohjelmoi luokkaan kolme julkista metodia:
  * avaaYhteys()
  * suljeYhteys() ja
  * haePizzat() [palauttaa ArrayListillisen Pizza-olioita]

## Servlet
* Muuta controllerin doGet-metodia. Servlet pyytää DAO-luokkaa avaamaan tietokantayhteyden, hakemaan pizzat ja sulkemaan yhteyden. Tallenna PizzaDAO:lta saatu lista requestin atribuutiksi kovakoodatun listan sijaan.
