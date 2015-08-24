#Tehtävä 1: Servletit

## Eclipse

Avaa Eclipse ja vaihda näkymäksi Java EE -perspektiivi

## Tomcat

* Luo Eclipseen uusi Tomcat-palvelininstanssi
* *Eclipse -> File -> New -> Other... -> Server -> Apache -> Tomcat v8.0 Server -> Browse... -> C:\install\apache-tomcat-7.0.39*

## Esimerkkikoodit

* Klonaa demoprojektit GitHubin ohke-Repositorysta
* *Eclipse -> File -> Import -> Projects from Git -> (Clone) URI -> https://github.com/jleikko/ohke.git*

##Projekti

* Luo uusi dynaaminen webbiprojekti eclipsellä ja anna sen nimeksi PizzeriaAdmin. (Target Runtime: Tomcat 7)

##Bean

* Luo pakkaus fi.omapizzeria.admin.bean.
* Luo java-luokka Pizza ja lisää siihen kolme atribuuttia: id (int), nimi (String) ja hinta (double)

##Servlet

* Luo pakkaus fi.omapizzeria.admin.controller.
* Luo uusi Servlet, jonka nimi on ControllerServlet ja merkitse se löytymään osoittteesta http://localhost:8080/PizzeriaAdmin/controller.
* Luo doGet-metodin sisällä ArrayList, ja lisää siihen vähintään kolme erilaista pizzaa.
* Tulosta doGet-metodin lopussa responseen collectionin sisältö käyttäen foreach-silmukkaa. Erottele pizzat toisistaan p-tageilla ja pizzan ominaisuudet toisistaan br-tageilla.

## *Vinkki servlettiin*
```java
//TEHDÄÄN LISTALLINEN OLIOITA
List<Pizza> lista = new ArrayList<Pizza>();
lista.add(new Pizza(1, "Margarita", 7.90));
lista.add(new Pizza(2, "Frutti di Mare", 9.90));

//KÄYDÄÄN LISTA LÄPI JA TULOSTETAAN KUKIN PIZZA HTML-MUOTOILTUNA
for(Pizza p : lista) {
	wout.println("<p>");
	wout.println("<b>" +p.getNimi() +"</b>");
	wout.println("<br/>");
	wout.println("Hinta: " + p.getHinta() +" EUR");
	wout.println("</p>");
}
```

## Testaus
* Testaa osoitetta http://localhost:8080/PizzeriaAdmin/controller
* Selaimen pitäisi näyttää html-muotoiltu pizzalista.
