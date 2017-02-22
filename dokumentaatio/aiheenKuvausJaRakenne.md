# Aiheen kuvaus

## Aihe:

DNA-ketjun muuntaja. Toteutan järjestelmän, joka toimii työkaluna DNA sekvenssin muuntamiseksi vastaavaksi mRNA-, tRNA- ja aminohapposekvenssiksi. Työkalun avulla voi myös tarkastella DNA-ketjun ominaisuuksia, kuten puriini- ja pyrimidiinipitoisuutta.

Käyttäjä voi lisätä uuden DNA-sekvenssin, jonka tulee olla proteiinia koodaavan eksonin kohdalta. Annetun sekvenssin ei tarvitse koodata kokonaista proteiinia, vaan voidaan myös tarkastella vain tiettyä osaa.

## Kaikkien käyttäjien toiminnot:

  - analysoitavan DNA-sekvenssin lisääminen
  - jos sekvenssi on validi, näytetään sitä vastaavat  mRNA-, tRNA- ja aminohapposekvenssit
  - napsauttamalla lisävaihtoehtoja käyttäjälle näytetään esim. DNA-ketjun  puriini- ja pyrimidiinipitoisuus

## Rakennekuvaus

DNA, MessengerRNA ja TransferRNA koostuvat Baseista, eli typpiemäksistä. Tarkemmin DNA koostuu A,T,C ja G emäksistä ja RNA:t A, U, C ja G emäksistä.

DNA:n koostavat emäkset määrittävät MessengerRNA:n emäsjärjestyksen, joka puolestaan määrittää TransferRNA:n emäsjärjestyksen. Proteiinin primäärirakenne, eli aminohappojärjestys, määrittyy TransferRNA:n avulla. Kukin tRNA:n kolmikirjaimisen kodoni vastaa jotain aminohappoa tai signaloi aminohappoketjun päättymistä (STOP).



![luokkakaavio](Luokkakaavio.png)

![sekvenssikaavio] (sKaavio.jpg)
