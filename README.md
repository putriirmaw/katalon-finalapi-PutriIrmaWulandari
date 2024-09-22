**Copy Repository GIT**
Buat repository lalu copy url repository

**CLONE GIT DI KATALON**
Klik Clone Git 
Masukkan url repository dan akun git kalian

**ENVIRONTMENT**
Klik kanan profile 
Pilih new - execution profile - buat env baru
Tambahkan url sebagai GlobalVarible

_CONTOH_
<img width="451" alt="Screenshot 2024-09-22 at 07 58 33" src="https://github.com/user-attachments/assets/65c1f54e-70f2-472c-a7dc-4b8866ca7679">

**OBJECT REPOSITORY**
buat object repo AUTH, GET, POST DELETE
Masukkan Header, Request body sesuai dengan contoh pada website 
https://restful-booker.herokuapp.com/apidoc/index.html

	a. Generate token dari object repo
 	b. Get data booking dengan Bookingid yang diberikan
		 Header -> Accept : application/json
		 Body -> Text-JSON
	   Step:
		 	- Run GET dengan url /Booking
			- Ambil salah satu Bookingid
	 		- Get data booking dengan id tersebut
 		**Test Case**
	 	1. Impor: Pertama, kita mengimpor JsonSlurper dari pustaka groovy.json.
		2. Membuat Instance: Kemudian, kita membuat instance dari JsonSlurper.
		3. Mengambil Konten Respons: Kita mengambil konten dari respons menggunakan getResponse.getResponseBodyContent().
		4. JSON: Terakhir, kita gunakan string JSON menjadi objek Groovy menggunakan parseText.
		5. Hasil: Kita bisa menampilkan hasil untuk melihat isi dari objek yang didapat.

	c. Post data bookingid GET 
 		Setting repo POST :
   <img width="534" alt="Screenshot 2024-09-22 at 09 56 21" src="https://github.com/user-attachments/assets/29a416be-42a5-461b-b36b-5f09f7164e1f">
   
	d. Delete 
     Setting repo delete :

  <img width="534" alt="Screenshot 2024-09-22 at 09 56 03" src="https://github.com/user-attachments/assets/6751d51f-186e-4970-8ad0-844197800f53">

	e. API Chaining Req
 		Gunakan token yang didapat dari hasil generate toke di repo AUTH dan masukkan kedalam HEader pada Repo delete sebagai value Cookies
