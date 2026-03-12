<img width="960" height="511" alt="image" src="https://github.com/user-attachments/assets/65b1b96c-25a7-4357-93b2-def38b3b05a1" />

# KTP API Spec

## Create KTP

Endpoint : POST /ktp

Request Body :

```json
{
  "nomorKtp" : "1234567890123456",
  "namaLengkap" : "Ujang Slebew",
  "alamat" : "Bandung",
  "tanggalLahir" : "2000-05-10",
  "jenisKelamin" : "Laki-laki"
}
```

Response Body (Success) :

```json
{
  "id" : 1,
  "nomorKtp" : "1234567890123456",
  "namaLengkap" : "Ujang Slebew",
  "alamat" : "Bandung",
  "tanggalLahir" : "2000-05-10T00:00:00.000Z",
  "jenisKelamin" : "Laki-laki"
}
```

Response Body (Failed) :

```json
{
  "errors" : "Nomor KTP already exists"
}
```

---

## Get All KTP

Endpoint : GET /ktp

Response Body (Success) :

```json
[
  {
    "id" : 1,
    "nomorKtp" : "1234567890123456",
    "namaLengkap" : "Ujang Slebew",
    "alamat" : "Bandung",
    "tanggalLahir" : "2000-05-09T17:00:00.000Z",
    "jenisKelamin" : "Laki-laki"
  }
]
```

Response Body (Failed) :

```json
{
  "errors" : "Data not found"
}
```

---

## Get KTP By ID

Endpoint : GET /ktp/{id}

Example :

```
GET /ktp/1
```

Response Body (Success) :

```json
{
  "id" : 1,
  "nomorKtp" : "1234567890123456",
  "namaLengkap" : "Ujang Slebew",
  "alamat" : "Bandung",
  "tanggalLahir" : "2000-05-09T17:00:00.000Z",
  "jenisKelamin" : "Laki-laki"
}
```

Response Body (Failed) :

```json
{
  "errors" : "KTP not found"
}
```

---

## Update KTP

Endpoint : PUT /ktp/{id}

Example :

```
PUT /ktp/1
```

Request Body :

```json
{
  "nomorKtp" : "1234567890123456",
  "namaLengkap" : "Ujang Slebew Silat",
  "alamat" : "Bandung",
  "tanggalLahir" : "2000-05-10",
  "jenisKelamin" : "Laki-laki"
}
```

Response Body (Success) :

```json
{
  "id" : 1,
  "nomorKtp" : "1234567890123456",
  "namaLengkap" : "Ujang Slebew Silat",
  "alamat" : "Bandung",
  "tanggalLahir" : "2000-05-10T00:00:00.000Z",
  "jenisKelamin" : "Laki-laki"
}
```

Response Body (Failed) :

```json
{
  "errors" : "KTP not found"
}
```

---

## Delete KTP

Endpoint : DELETE /ktp/{id}

Example :

```
DELETE /ktp/1
```

Response Body (Success) :

```json
{
  "data" : "KTP deleted successfully"
}
```

Response Body (Failed) :

```json
{
  "errors" : "KTP not found"
}
```
