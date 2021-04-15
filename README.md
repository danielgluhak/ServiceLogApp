# ServiceLogApp

Zasniva se na modelu CRUD.

Aplikacija služi za monitoring ulaza vozila i njihovih vlasnika te unos stavaka za svako pojedino vozilo.
Pri kreiranju entiteta ServiceLog, svi podatci se kupe i spremaju u MariaDB pomoću Hibernate-a. 

Mogućnosti:
  - unos i ažuriranje podataka stranaka
  - unos i ažuriranje podataka vozila
  - unos stavaka vezanih uz vozilo
  - pretraživanje podataka po ID-u ili ostalim parametrima
  - brisanje radnog naloga po završetku usluge

Pri kreiranju entiteta Customer i Vehicle vrši se upis vrijednosti. Vrijednosti se spremaju.
Pri kreiranju entiteta ServiceLog vrši se odabir vlasnika i vozila, planirani datum dolaska, 
dodaju se stavke za servis te se jednim klikom svi podatci spremaju.

