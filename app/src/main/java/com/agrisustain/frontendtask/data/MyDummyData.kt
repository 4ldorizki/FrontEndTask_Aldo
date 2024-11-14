package com.agrisustain.frontendtask.data

import com.agrisustain.frontendtask.R
import com.agrisustain.frontendtask.model.Film
import com.agrisustain.frontendtask.model.Game
import com.agrisustain.frontendtask.model.Lagu
import com.agrisustain.frontendtask.model.Mahasiswa

object MyDummyData {
    val mahasiswa = listOf(
        Mahasiswa(
            id = 1,
            nama = "Aldo Rizki Mukhtar",
            email = "aldorizki@gmail.com",
            kampus = "Poltek Batam",
            jurusan = "Teknologi Rekayasa Perangkat Lunak",
            foto = R.drawable.aldo
        )
    )
    val game = listOf(
        Game(
            id = 1,
            nama = "Mobile Legend",
            deskripsi = "Deskripsi Mobile Legend",
            gambar = R.drawable.mole
            // tambahkan foto untuk item game
        ),
        Game(
            id = 2,
            nama = "Brawlhalla",
            deskripsi = "Deskripsi Brawlhalla",
            gambar = R.drawable.brawlhalla
        ),
        Game(
            id = 3,
            nama = "Counter-strike 2",
            deskripsi = "Deskripsi CS2",
            gambar = R.drawable.cs2
        ),
        Game(
            id = 4,
            nama = "Terraria",
            deskripsi = "Deskripsi terraria",
            gambar = R.drawable.terraria
        ),
        Game(
            id = 5,
            nama = "Apex Legend",
            deskripsi = "Deskripsi Apex",
            gambar = R.drawable.apex
        ),
        Game(
            id = 6,
            nama = "Assassin's Creed Unity",
            deskripsi = "Deskripsi AC",
            gambar = R.drawable.unity
        ),
        Game(
            id = 7,
            nama = "Dark Souls 3",
            deskripsi = "Deskripsi Dark souls 3",
            gambar = R.drawable.darksouls
        ),
        Game(
            id = 8,
            nama = "Sekiro: Shadows die twice",
            deskripsi = "Deskripsi Sekiro",
            gambar = R.drawable.sekiro
        ),
        Game(
            id = 9,
            nama = "Valorant",
            deskripsi = "Deskripsi valorant",
            gambar = R.drawable.valorant
        ),
        Game(
            id = 10,
            nama = "Elden Ring",
            deskripsi = "Deskripsi Elden Ring",
            gambar = R.drawable.eldenring
        )
    )

    val film = listOf(
        Film(
            id = 1,
            judul = "Fight Club",
            sinopsis = "Welcome to the fight club",
            gambar = R.drawable.fightclub
        ),
        Film(
            id = 2,
            judul = "Interstellar",
            sinopsis = "Sinopsis Interstellar",
            gambar = R.drawable.interstellar
        ),
        Film(
            3,
            "Breaking Bad",
            "Sinopsis Breaking Bad",
            R.drawable.breakingbad
        ),
        Film(
            4,
            "Venom: The last dance",
            "Sinopsis Venom",
            R.drawable.venom
        ),
        Film(
            5,
            "Spiderman: Far from home",
            "Sinopsis spiderman",
            R.drawable.spiderman
        ),
        Film(
            6,
            "Avengers: Endgame",
            "Sinopsis endgame",
            R.drawable.endgame
        ),
        Film(
            7,
            "A Slient Voice",
            "Sinopsis A silent voice",
            R.drawable.aslientvoice
        ),
        Film(
            8,
            "Pengabdi Setan 2",
            "Sinopsis pengabdi setan 2",
            R.drawable.pengabdisetan2
        ),
        Film(
            9,
            "Dr. Strange: Multiverse Of Madness",
            "Sinopsis Dr. Strange: MoM",
            R.drawable.drstrange
        ),
        Film(
            10,
            "The Wind Rises",
            "Sinopsis The Wind Rises",
            R.drawable.thewindrises
        )
    )

    val lagu = listOf(
        Lagu(
            1,
            "Happiness",
            "Rex Orange County",
            R.drawable.happiness
        ),
        Lagu(
            2,
            "I Wanna Be Yours",
            "Arctic Monkeys",
            R.drawable.iwtby
        ),
        Lagu(
            3,
            "Pluto Projector",
            "Rex Orange County",
            R.drawable.plutoprojector
        ),
        Lagu(
            4,
            "Best Friend",
            "Rex Orange County",
            R.drawable.bestfriend
        ),
        Lagu(
            5,
            "Sick Feeling",
            "Boy pablo",
            R.drawable.sickfeeling
        ),
        Lagu(
            6,
            "Seasons",
            "Wave to Earth",
            R.drawable.seasons
        ),
        Lagu(
            7,
            "Bad",
            "Wave to Earth",
            R.drawable.bad
        ),
        Lagu(
            8,
            "Sleep Well",
            "D4vd",
            R.drawable.sleepwell
        ),
        Lagu(
            9,
            "UNDERSTAND",
            "Keshi",
            R.drawable.understand
        ),
        Lagu(
            10,
            "Welcome and goodbye",
            "Dream, Ivory",
            R.drawable.welcomeandgoodbye
        )
    )
}