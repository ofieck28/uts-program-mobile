package com.example.katalogmotor;


import android.content.Context;

import com.example.katalogmotor.model.Honda;
import com.example.katalogmotor.model.Motor;
import com.example.katalogmotor.model.Suzuki;
import com.example.katalogmotor.model.Yamaha;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Motor> motors = new ArrayList<>();

    private static List<Honda> initDataHonda(Context ctx) {
        List<Honda> hondas = new ArrayList<>();
        hondas.add(new Honda("HONDA CT125", "Honda CT125 hadir dengan warna Glowing Red yang dipasarkan dengan harga On The Road (OTR) DKI Jakarta Rp75.000.000,- Model ini dipasarkan secara eksklusif di seluruh jaringan Honda Big Wing dan Wing dealer.",
                R.drawable.honda_ct125));
        hondas.add(new Honda("HONDA FORZA 250", "Hadirnya Honda Forza 250 di Jepang membuka kesempatan motor ini akan dipasarkan di Negara Asia lainnya, termasuk Indonesia. Berbekal teknologi lebih canggih dan desain lebih modern, kami yakin Forza 250 mampu bersaing untuk mengalahkan penjualan XMAX 250 yang sudah tidak bisa dibendung lagi. Nah bagi sobat otomotif yang tertarik membelinya dan penasaran ingin mengetahui apa saja fitur yang dimiliki Forza 250, silahkan sobat menyimak informasi spesifikasi dan harga Honda Forza 250 yang kamu rangkum pada artikel otomania",
                R.drawable.honda_forza_250));
        hondas.add(new Honda("HONDA SUPER CUB 125", "Honda Super Cub C125. Harga Honda Super Cub C125 2020 di Indonesia dimulai dari Rp 72,7 Juta. Tersedia dalam 3 pilihan warna dan 1 varian di Indonesia. Super Cub C125 digerakkan oleh mesin 125 cc dengan transmisi 4-Speed. Honda Super Cub C125 memiliki tinggi jok 780 mm dengan bobot 107 kg. Rem depan menggunakan Disc, sedangkan di belakang Drum.",
                R.drawable.honda_super_cub125));
        hondas.add(new Honda("HONDA SUPRA 125 FI", "harga Honda Supra X 125 FI 2020, spesifikasi, fitur, warna, konsumsi BBM, review redaksi oto. Bahkan bisa dilihat juga review oleh yang sudah punya Supra X 125 FI 2020 terbaru. Lihat promo dan simulasi kredit di bulan November di kota Anda. Bandingkan juga Supra X 125 FI 2020 dengan rivalnya seperti Revo,harga Dibawah 20 Juta. ",
                R.drawable.honda_supra_125_fi));


        return hondas;
    }
    private static List<Suzuki> initDataSuzuki(Context ctx) {
        List<Suzuki> suzukis = new ArrayList<>();
        suzukis.add(new Suzuki("SUZUKI BIG BIKE", "harga yang suzuki big bike sudah dibanderol pada motor big bike dari Suzuki ini akan dibanderol dengan harga kisaran 400 jutaan rupiah lebih. 2. Motor Suzuki Big Bike Terbaik. Suzuki GSX R1000R ABS memang sudah tidak perlu untuk diragukan kembali, karena Suzuki GSX R1000R ABS menjadi motor big bike terbaik dari suzuki.",
                R.drawable.suzuki_big_bike));
        suzukis.add(new Suzuki("SUZUKI GSX R 150", "Harga Suzuki GSX R150 - Ada beberapa pilihan motor sport full fairing bermesin 150cc yang bisa masbro beli di Indonesia, dan salah satunya adalah Suzuki GSX R150. Motor ini diciptakan untuk melawan Yamaha R15 dan Honda CBR150R yang hadir terlebih dahulu di Indonesia,Suzuki GSX-R150 dapat sentuhan EcstarMotoGP, harga Rp31,6 juta. Otomotif.",
                R.drawable.suzuki_gsx_r150));
        suzukis.add(new Suzuki("SUZUKI GSX S150", "Harga Motor Suzuki GSX S150 - Motor sport street bike yang gesit dan ringan menjadi kelebihan GSX-S150.Motor ini bersaing melawan Yamaha Vixion dan All New CB150R. Lagi-lagi harga motor Suzuki lebih murah, sehingga membuatnya lebih menarik untuk dimiliki,",
                R.drawable.suzuki_gsx_s150));
        suzukis.add(new Suzuki("SUZUKI NEX 2", "arga Suzuki NEX 2 terbaru tipe Sporty Runner: Rp. 14.650.000…. Varian ini mencirikan ekspresi generasi muda yang lebih sporty dan aktif, Suzuki NEX I Sporty Runner juga dilengkapi dengan LED Headlight, USB Charger, Sporty Body Striping Set, Meter Visor, Cover Muffler + Hole, ",
                R.drawable.suzuki_big_bike));
        suzukis.add(new Suzuki("SUZUKI SATRIA F150", "Suzuki SATRIA F150 2020 hadir dengan pilihan warna menarik dengan spesifikasi mesin Real DOHC. memiliki 5 pilihan warna menarik harga mulai 23 jutaan.",
                R.drawable.suzuki_satria_f150));

                return suzukis;
    }

    private static List<Yamaha> initDataYamaha(Context ctx) {
        List<Yamaha> yamahas = new ArrayList<>();
        yamahas.add(new Yamaha("YAMAHA MX KING MONSTER", "Yamaha Jupiter MX King 150 menjadi andalan Yamaha di kelas motor bebek. Motor ini menjadi lawan sepadan Honda Supra GTR yang sama-sama ditenagai mesin berkapasitas 150cc. Selain kedua motor tersebut sebenarnya masih ada Honda Sonic 150R dan Suzuki Satria F150, namun apabila disuruh head-to-head maka lawan yang panatas untuk MX King adalah Supra GTR.",
                R.drawable.yamaha_mx_king_monster));
        yamahas.add(new Yamaha("YAMAHA R15 MOVISTAR", "Yamaha R15 2020 – Peminat motor sport di Indonesia sangat besar. Oleh karena itulah setiap pabrikan memiliki motor andalannya masing-masing. Nah di kubu Yamaha ada All New R15 yang siap menantang Honda CBR150R dan Suzuki GSX-R150. Motor ini menawarkan spesifikasi mesin lebih canggih dan didukung teknologi terkini yang menjadikannya sebagai salah satu motor sport 150cc terbaik di Indonesia,Harga Motor R15 Movistar: Rp. 35.900.000",
                R.drawable.yamaha_r15_movistar));
        yamahas.add(new Yamaha("YAMAHA RX KING", "Yamaha RX King sebagai motor 2 tak legendaris tetap bertahan hingga sekarang.Sebagai buktinya adalah banyaknya klub RX King yang tersebar di berbagai kota di Indonesia. Kepopuleran Yamaha RX King tidak lepas dari performa yang dimilikinya,",
                R.drawable.yamaha_rx_king));
        yamahas.add(new Yamaha("YAMAHA SUPER CUB", "Yamaha Super Cub C125 - Penjualan motor bebek memang kalah dari motor matic, namun Honda tetap konsisten merilis motor bebek baru yang mampu menarik minat pecinta otomotif dari seluruh dunia. Nah produk terbarunya adalah Honda Super Cub C125 yang merupakan reinkarnasi dari Honda Super Cub C100. Bagi sobat yang menyukai motor klasik pasti tidak asing dengan Super Cub C100",
                R.drawable.yamaha_super_cub_125));
        yamahas.add(new Yamaha("YAMAHA SUPRA X", "Yamaha supra X 125 bekas.Sepeda motor Honda Supra X 125 paling laris saat ini. Berikut daftar harga Honda Supra X 125 bekas di pasaran hari ini.Honda Supra X 125 merupakan motor bebek buatan AHM yang tetap eksis hingga saat ini, padahal sudah melalui masa produksi beberapa tahun",
                R.drawable.yamaha_supra_x_125));
        return yamahas;

    }

    private static void initAllLaptops(Context ctx) {
        motors.addAll(initDataHonda(ctx));
        motors.addAll(initDataSuzuki(ctx));
        motors.addAll(initDataYamaha(ctx));

    }

    public static List<Motor> getAllMotor(Context ctx) {
        if (motors.size() == 0) {
            initAllLaptops(ctx);
        }
        return motors;
    }

    public static List<Motor> getMotorsbytipe(Context ctx, String type) {
        List<Motor> motorsByType = new ArrayList<>();
        if (motors.size() == 0) {
            initAllLaptops(ctx);
        }
        for (Motor h : motors) {
            if (h.getMerk().equals(type)) {
                motorsByType.add(h);
            }
        }
        return motorsByType;
    }

}
