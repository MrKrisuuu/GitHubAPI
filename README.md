# allegro-summer-experience-2022

Email użyty w rekrutacji: ksurowka57@gmail.com

Z racji tego, iż robiłem podobne API na zajęcia na studia w Pythonnie (https://github.com/MrKrisuuu/PythonAPIExample) to postanowiłem zrobić API tym razem w Javie. Zadanie zostało zrobione z użyciem frameworka Spring Boot. Stworzyłem projket Maven przy pomocy Spring Initializr. 

Projekt należy pobrać do IDE (ja używałem IntelliJ) i go zbudować. Następnie należy go odpalić i postawi się serwer na localhost:8080. Wystarczy użyć przeglądarki (http://localhost:8080/) i ukaże się na prosta strona, gdzie należy wpisać nazwę użytkownika i kliknąć Submit. Zostaniemy przekierowani do innej strony z wynikami. Możemy kliknąć przycisk "Submit another form", aby powtórzyć proces.

Z racji tego, że podobnie zadanie miałem na studiach, to od razu wiedziałem co należy zrobić. Bałem się że problemem może być pozystanie danych, ale okazuje się że GitHub wspiera API i podaje dane w formacie JSON. Korzystam z 3 stron, bo tyle wystarczy do rozwiązania zadania (gdyby potrzeba było znaleźć inne dane to wystarczy poszukać odpowiednich URL):
- https://api.github.com/users/MrKrisuuu
- https://api.github.com/repos/MrKrisuuu/GeneralizedTicTacToe/languages
- https://api.github.com/users/MrKrisuuu/repos

W URL wystarczy zmienić nazwę użytkownika/projektu co jest bardzo proste. Skoro dane są podane w JSON to jest bardzo łatwo na nich operować, bo są do tego odpowiednie biblioteki (w Pythonie jest jeszcze łatwiej, bo są to po prostu listy i słowniki). Pobieram nazwę użytkownika za pomocą bardzo prostego formularza (chciałem żeby było proste połączenie z Frontendem), który potem można ulepszać. Jeśli chodzi o pobieranie i przetwarzanie danych, to mogą one rzucać wyjątki (takie jak NullPointerException). Stwierdziałem, że lepsze jest wyświetlenie niczego, niż wywalenie całego programu, dlatego obudowałem pewne fragmenty kodu w try-catch. Wyświeltam dane za pomocą prostego pliku html, który Frontend również może potem ulepszać, aby dane mogły się ładniej prezenować na stronie.

Ogółem bardzo przyjemne zadanie, które nie sprawiło większych problemów.
