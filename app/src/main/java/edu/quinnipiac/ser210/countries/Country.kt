package edu.quinnipiac.ser210.countries

data class Country(
    val name: String,
    val flag: Int,
    val capital: String,
    val currency: String,
    val fact: String,
    val map: Int
    
) 

 val CountryList = listOf<Country>(
            Country("India", R.drawable.india, "New Delhi", "Indian Rupe", "100 million people come to India's Kumbh Mela Festival, the world's biggest gathering of humans", R.drawable.india_map),
            Country("Pakistan", R.drawable.pakistan, "Islamabad", "Pakistani Rupee", "Pakistan, officially the Islamic Republic of Pakistan, is a country in South Asia. It is the sixth-most populous country with a population exceeding 199 million people", R.drawable.pakistan_map),
            Country("Sri Lanka", R.drawable.srilanka, "Colombo", "Sri Lankan Rupee", "Sri Lanka (formerly Ceylon), a tiny island nation south of India in the Indian Ocean, is a rugged land of rainforest, diverse wildlife and endless beaches. It’s famed for its ancient Buddhist ruins, including the 5th-century citadel Sigiriya, with its palace and frescoes, and the sacred city of Anuradhapura", R.drawable.srilanka_map),
            Country("China", R.drawable.china, "Beijing","Renmini", "China, a communist nation in East Asia, is the world’s most populous country. Its vast landscape encompasses grassland, desert, mountain ranges, lakes, rivers and 14,500km of coastline. Beijing, the capital, mixes modern architecture with historic sites including sprawling Tiananmen Square.", R.drawable.china_map),
            Country("Afghanistan", R.drawable.afghanistan, "Kabul", "Afghani", "Afghanistan officially the Islamic Republic of Afghanistan, is a landlocked country located within South Asia and Central Asia.", R.drawable.afghanistan_map),
            Country("North Korea", R.drawable.nkorea, "Pyongyang", "North Korea Won", "North Korea Officially the Democratic People's Republic of Korea, is a country in East Asia, in the northern part of the Korean Peninsula. The name Korea is derived from the Kingdom of Goguryeo, also spelled as Koryŏ", R.drawable.nkorea_map),
            Country("South Korea", R.drawable.skorea, "Seoul", "South Korean Won", "South Korea, an East Asian nation on the southern half of the Korean Peninsula, shares one of the world’s most heavily militarized borders with North Korea. It’s equally known for its green, hilly countryside dotted with cherry trees and centuries-old Buddhist temples", R.drawable.skorea_map),
            Country("Japan", R.drawable.japan, "Tokyo", "Japanese Yen", "Japan is an island nation in the Pacific Ocean with high-rise-filled cities, imperial palaces, mountainous national parks and thousands of shrines and temples. Tokyo, the crowded capital, is known for its neon skyscrapers and pop culture", R.drawable.japan_map)
        )
