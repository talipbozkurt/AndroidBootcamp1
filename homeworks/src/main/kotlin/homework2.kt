fun main() {
    //
    println("Fahrenheit: ${dereceyiFahrenheiteDonustur(25.0)}")
    println("Dikdörtgen Çevresi: ${dikdortgenCevresi(5, 10)}")
    println("Faktöriyel: ${faktoriyel(5)}")
    println("'a' Harfi Sayısı: ${aHarfiniSay("Ankara")}")

    // Yeni ödevler
    println("İç Açılar Toplamı: ${icAciToplami(5)}")
    println("Maaş: ${maasHesapla(22)}")
    println("İnternet Ücreti: ${kotaUcretiHesapla(60)}")
}

// 1. Dereceyi Fahrenheit'a dönüştür
fun dereceyiFahrenheiteDonustur(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 2. Dikdörtgenin çevresi
fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
    return 2 * (kisaKenar + uzunKenar)
}

// 3. Faktöriyel hesaplama
fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

// 4. 'a' harfi sayısı bulma
fun aHarfiniSay(kelime: String): Int {
    return kelime.lowercase().count { it == 'a' }
}

// 5. İç açılar toplamını hesapla
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// 6. Maaş hesaplama
fun maasHesapla(gunSayisi: Int): Int {
    val calismaSaati = gunSayisi * 8
    return if (calismaSaati <= 160) {
        calismaSaati * 10
    } else {
        val mesaiSaati = calismaSaati - 160
        (160 * 10) + (mesaiSaati * 20)
    }
}

// 7. Kota ücreti hesaplama
fun kotaUcretiHesapla(kotaMiktari: Int): Int {
    return if (kotaMiktari <= 50) {
        100
    } else {
        100 + (kotaMiktari - 50) * 4
    }
}
