* Bottom nav da user ın ana kategorileri mevcut.
* Her bottom nav item ı kendi içinde bir graph a sahip bizim UX de.
* Burada amacımız, kullanıcı aşağıdaki path i izlediğinde cihazın back tuşu ile stack de doğru şekilde geri dönmesi.

flow;

1. A bottom tab ile başlar
2. A1 ekranına gider
3. A2 ekranına gider
4. A3 ekranına gider
5. B bottom tabına geçer.
6. B1  ekranına gider
7. B2  ekranına gider
8. B3  ekranına gider
9. Cihazın back tuşu ile geri gelmeye çalıştıgında B-stack i bitince A tabında A1'e dönüyor. Beklenen ise A3'e dönmesi.
10. Tekrar B tabına geçilir
11. Geri yapmadan A tabına tıklanarak yapılan geçişte ise A3 ekranı doğru şekilde açılıyor.
