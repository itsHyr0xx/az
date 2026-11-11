# AziendePlugin

Questo plugin crea un sistema base per:
- creare aziende da parte dello staff
- assegnare il capo di un'azienda
- creare sotto-ranghi per ogni azienda
- invitare un giocatore entro 10 blocchi
- mostrare una GUI con Accetta / Rifiuta
- assegnare automaticamente il gruppo LuckPerms dopo l'accettazione

Uso rapido:

1. Staff crea l'azienda:
   /staffaziende crea finanza admin

2. Il capo della azienda si auto-assegna:
   /azienda capo finanza

3. Staff crea un sotto-rango:
   /staffaziende crea rango finanza "Sotto Tenente" sottotenente

4. Il capo assume un giocatore vicino:
   /azienda assumi Nick "Sotto Tenente"

Il giocatore riceverà una GUI con 2 pulsanti:
- Accetta
- Rifiuta

Il comando /staffaziende è accessibile solo allo staff con il permesso:
- staffaziende

Prerequisiti:
- Paper 1.21.8
- LuckPerms installato
- Java 21
