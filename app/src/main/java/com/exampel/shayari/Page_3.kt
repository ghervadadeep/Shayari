package com.exampel.shayari

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class Page_3 : AppCompatActivity() {

    var Attitude = arrayOf(
        "तुम अच्छे हो तो बनकर दिखाओ हम बुरे है तो साबित करो।",
        "जो इज्जत देगा उसी इज्जत मिलेगी, हम हैसियत देखकर सर नहीं झुकाते हैं।",
        "हम तो पहले से ही बिगड़े हुए हैं हमारा कोई क्या बिगाड़ लेगा।",
        "कभी अकेला चलना पड़े तो डरना मत क्योंकि शमशान, शिखर और सिंहासन पर आदमी अकेले ही होता है।",
        "भूल जाओगे फड़फड़ाना जब वारदात हमारे अंदाज में होगी।",
        "मेरा बुरा करोगे तो कर्म तो बहुत दूर की बात सबसे पहले मैं मारूंगा।",
        "लिबास कितना ही कीमती क्यों ना हो घटिया किरदार को छुपा नहीं सकता।",
        "वसीयत लिखने से कुछ नहीं होता ये उड़ान बताती है कि आसमान किसका है।",
        "अब तुम लौट कर आने की तकलीफ मत करना, हमें एक मोहब्बत को दो बार करने की आदत नहीं है।",
        "जो लोग बुरे वक्त में हालात देखकर छोड़ गए थे, कोई बात नहीं, वक्त ऐसा लाओ कि वह तुम्हें देखकर बाद में पछतावा करें।",
        "बेटा जोश में नहीं होश में आओ, अपनी औकात में रहो हमें मत सिखाओ।",
        "दुनिया खामोशी भी सुनती है लेकिन पहले दहशत मचानी पड़ती है।",
        "कपड़े और चेहरे अक्सर झूठ बोला करते हैं इंसान की असलियत तो वक्त ही बताता है।",
        "बुरे हैं हम तभी तो जी रहे हैं अच्छे होते तो दुनिया जीने नहीं देती।",
        "जो लोग मुझे समझ ना सके उन्हें हक है कि मुझे बुरा ही समझे।",
        "रहते हैं आस-पास ही लेकिन पास नहीं होते कुछ लोग मुझसे जलते हैं बस खाक नहीं होते।",
        "पसंद आया तो दिल में, नहीं तो दिमाग में भी नहीं।",
        "हथियार तो हम शौक के लिए रखते हैं खौफ के लिए तो हमारा नाम ही काफी है।",
        "कुछ लोग चप्पल के जैसे होते हैं साथ तो देते हैं पर पीछे से कीचड़ उड़ाते रहते हैं।",
        "इसी बात से लगा लेना मेरी शोहरत का अंदाजा, वह मुझे सलाम करते हैं जिन्हें तू सलाम करता हैं।",
        "तेरी दहाड़ से ज्यादा मेरी खामोशी का खौफ है।",
        "अंजाम चाहे जो भी हो पर खेल तो अब बड़ा ही खेलेंगे।",
        "निभा ना सकेंगे एक भी दिन वो मेरा किरदार मशवरे जो देते फिरते हैं हजार।",
        "और अकड़ क्यों ना हो मुझमें मैं टूटने की हद तक गया हूं।",
        "लोग बदलते नहीं बस खुलकर सामने आ जाते हैं।",
        "जो साथ रहकर सवार ना सके वो खिलाफ होकर क्या बिगाड़ लेंगे।"
    )

    var Hindi = arrayOf(
        "नाम बड़ा हो, तो बदनाम होने में देर नहीं लगती..!",
        "जिंदगी बितानी है, पर तुम बिन नहीं..",
        "धोख़ा दिल नहीं, दिमाग़ देता हैं..",
        "विचारों में हो ताकत, तो नहीं होती जिंदगी में आहत..",
        "जहां चाहें वहां चलेंगे, तुम बोलो तो सही...",
        "राहें गलत नहीं होती, हम गलत चुन लेते हैं..",
        "मुश्किल दौर है ये, हात छुटने नहीं देना..",
        "दोस्ती टूटती नहीं हैं, हम उसे तोड़ देते हैं..",
        "जो अधूरा होता है, वही सबसे प्यारा होता है..!",
        "असली शिक्षा की ही, होती अग्निपरीक्षा..",
        "बेवफाई एक बार करो, तो आदत बन जाती हैं..",
        "रिश्ते वही दूर होते, जो दिल के करीब है होते..!",
        "तेरे साथ जो ख्वाब था, वो लाजवाब था..",
        "धोख़ा मिले तो संभल जाओ, अपनों के लिए...",
        "निगाहों में वही लोग हैं बसते, जिनके लिए हम तरसते...",
        "बदला हुआ वक्त याद नहीं रहता, मगर लोग याद रहते हैं..",
        "थामा हात, हर घड़ी, जब मुश्किल में पड़ी..",
        "जिंदगी ही है यारों, मजबूर तो होगी ही..!",
        "नजरों से गुलाब, होठों से गुलकंद बरसाती..",
        "हर नादानियां माफ हो, मगर धोखा कभी ना हो..",
        "अक्सर अधूरी कहानियां ही याद की जाती है..."
    )

    var Bewafa = arrayOf(
        "अकेले ही गुजरती है ज़िन्दगी, लोग तसल्लियाँ तो देते हैं पर साथ नहीं।",
        "खोई मोहब्बत रोने से नहीं मिलती।",
        "एक ही समझने वाला था मुझे, अब वो भी समझदार हो गया।",
        "बहुत गौर से देखने पर जाना मैंने, दिल से बड़ा दुश्मन जमाने में नहीं।",
        "जख्म कहाँ-कहाँ से मिले छोड़ इन बातों को, जिंदगी तू तो यह बता सफर कितना बाकी।",
        "ज़्यादा कुछ नहीं बदला उसके और मेरे बीच में, पहले नफरत नहीं थी और अब प्यार नहीं है।",
        "संग उनके हम दो पल बीताना चाहते हैं, जो हमारे न हो कर भी हमारे है।",
        "मेरे लफ़्ज़ों में ज़िंदा रहने वाली, मैं तेरी ख़ामोशियों से मर रहा हूँ।",
        "बस कर ऐ दिल, उसके बिना अब तेरा धड़कना भी अच्छा नहीं लगता।",
        "इतने मशरूफ़ कहाँ हो गए तुम, आजकल दिल तोड़ने भी नहीं आते।",
        "तेरे चले जाने के बाद इतने गम मिले की तेरे जाने का गम भी याद ना रहा।",
        "मय्यत पर मेरी आए हैं कुछ इस अदा से वो, सब उन पर मर मिटे, मुझे तन्हा छोड़ के।",
        "मैं उस किताब का आख़िरी पन्ना था, मैं ना होता तो कहानी ख़त्म न होती।",
        "धडकनों को कुछ तो काबू में कर ए दिल, अब वो गयी।"
    )

    var Birthday = arrayOf(
        "जन्मदिन की खुशियों से सजी हो तेरी पलकें।",
        "जन्मदिन के इस मौके पर, तेरी मुस्कान हर दर्द भुलाए।",
        "जन्मदिन की बधाई, तेरी रौशनी दुनिया को आबाद करे।",
        "जन्मदिन की दुआ है, तेरा सफर हमेशा सुरक्षित रहे।",
        "जन्मदिन का ताज़ा हवाओं सा, सदा तुझे जोशीला रखे।",
        "जन्मदिन की खुशियों में, तेरी ज़िन्दगी रंगीन हो।",
        "जन्मदिन की बधाई, तेरा सपना हमेशा पुरा हो।",
        "जन्मदिन की शुभकामनाएँ, तेरी मुस्कान सदा ताज़ा रहे।",
        "जन्मदिन की खुशियों से भरी हो तेरी दुनिया।",
        "जन्मदिन की बधाई, तेरा हर सपना हकीकत बने।",
        "जन्मदिन की रौशनी में, तेरी ज़िंदगी खुशियों से भरी हो।",
        "जन्मदिन की बधाई, तेरी हर मुराद पूरी हो।",
        "जन्मदिन का सफर, तेरी खुशियों से भरा हो।",
        "जन्मदिन की दुआ है, तेरी खुशियाँ हमेशा साथ रहें।",
        "जन्मदिन का ये दिन हर पल यादगार रहे।",
        "जन्मदिन की खुशियाँ, तेरे दिल के हर राज़ बताती हैं।",
        "जन्मदिन की रात, तेरी मुस्कान दिलों को बहलाती है।",
        "जन्मदिन की दुआ है, खुशियों का सफर हमेशा जारी रहे।",
        "जन्मदिन की बारात, तेरी ज़िन्दगी को नया आयन दिखाती है।",
        "जन्मदिन की खुशियाँ हमेशा तेरे दिल में बसी रहें।",
    )

    var Pagli = arrayOf("Pagli1", "Pagli2", "Pagli3")

    var Dhokha = arrayOf("Dhokha1", "Dhokha2", "Dhokha3")

    var Dosti = arrayOf("Dosti1", "Dosti2", "Dosti3")

    var Facebook = arrayOf("Facebook1", "Facebook2", "Facebook3")

    var Funny = arrayOf("Funny1", "Funny2", "Funny3")

    var Love = arrayOf("Love1", "Love2", "Love3")

    var Mohabbat = arrayOf("Mohabbat1", "Mohabbat2", "Mohabbat3")

    var Prem = arrayOf("Prem1", "Prem2", "Prem3")

    var Dard = arrayOf("Dard1", "Dard2", "Dard3")

    var Pyar = arrayOf("Pyar1", "Pyar2", "Pyar3")

    var Romantic = arrayOf("Romantic1", "Romantic2", "Romantic3")

    var Royal = arrayOf("Royal1", "Royal2", "Royal3")

    var Whatsapp = arrayOf("Whatsapp1", "Whatsapp2", "Whatsapp3")

    var Udasi = arrayOf("Udasi1", "Udasi2", "Udasi3")

    var Morning = arrayOf("Morning1", "Morning2", "Morning3")

    var Night = arrayOf("Night1", "Night2", "Night3")

    var Intjar = arrayOf("Intjar1", "Intjar2", "Intjar3")

    var Judaay = arrayOf("Judaay1", "Judaay2", "Judaay3")

    var Painful = arrayOf("Painful1", "Painful2", "Painful3")

    var Gazal = arrayOf("Gazal1", "Gazal2", "Gazal3")

    var blanklist = arrayOf<String>()

    lateinit var txt: TextView

    lateinit var mylist2: ListView

//    lateinit var btn2 : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_page_3)

        txt = findViewById(R.id.txt)

        mylist2 = findViewById(R.id.mylist2)

//        btn2 = findViewById(R.id.btn2)

//        btn2.setOnClickListener {
//            var intent = Intent(this@c1,category_page_activity::class.java)
//            startActivity(intent)
//        }

        var getindex = intent.getIntExtra("index", 0)

        Log.e("====", "onCreate: $getindex")

        if (getindex == 0) {
            txt.setText("Attitude Shayari")
            blanklist = Attitude
        } else if (getindex == 1) {
            txt.setText("Best Hindi Shayari")
            blanklist = Hindi
        } else if (getindex == 2) {
            txt.setText("Bewafa Shayari")
            blanklist = Bewafa
        } else if (getindex == 3) {
            txt.setText("Birthday Shayari")
            blanklist = Birthday
        } else if (getindex == 4) {
            txt.setText("Dekh Pagli Shayari")
            blanklist = Pagli
        } else if (getindex == 5) {
            txt.setText("Dhokha Shayari")
            blanklist = Dhokha
        } else if (getindex == 6) {
            txt.setText("Dosti Shayari")
            blanklist = Dosti
        } else if (getindex == 7) {
            txt.setText("Facebook Shayari")
            blanklist = Facebook
        } else if (getindex == 8) {
            txt.setText("Funny Shayari")
            blanklist = Funny
        } else if (getindex == 9) {
            txt.setText("Love Shayari")
            blanklist = Love
        } else if (getindex == 10) {
            txt.setText("Mohabbat Shayari")
            blanklist = Mohabbat
        } else if (getindex == 11) {
            txt.setText("Prem Shayari")
            blanklist = Prem
        } else if (getindex == 12) {
            txt.setText("Dard Shayari")
            blanklist = Dard
        } else if (getindex == 13) {
            txt.setText("Pyar Shayari")
            blanklist = Pyar
        } else if (getindex == 14) {
            txt.setText("Romantic Shayari")
            blanklist = Romantic
        } else if (getindex == 15) {
            txt.setText("Royal Shayari")
            blanklist = Royal
        } else if (getindex == 16) {
            txt.setText("Whatsapp Shayari")
            blanklist = Whatsapp
        } else if (getindex == 17) {
            txt.setText("Udasi Shayari")
            blanklist = Udasi
        } else if (getindex == 18) {
            txt.setText("Good Morning Shayari")
            blanklist = Morning
        } else if (getindex == 19) {
            txt.setText("Good Night Shayari")
            blanklist = Night
        } else if (getindex == 20) {
            txt.setText("Intjar Shayari")
            blanklist = Intjar
        } else if (getindex == 21) {
            txt.setText("Judaay Shayari")
            blanklist = Judaay
        } else if (getindex == 22) {
            txt.setText("Painful Shayari")
            blanklist = Painful
        } else if (getindex == 23) {
            txt.setText("Gazal Shayari")
            blanklist = Gazal
        }

        mylist2.setOnItemClickListener { adapterView, view, position, l ->
            var intent = Intent(this@Page_3, Page_4::class.java)
            intent.putExtra("list", blanklist)
            intent.putExtra("pos", position)
            intent.putExtra("index123", getindex)
            startActivity(intent)
        }

//        var myadapter = ArrayAdapter(
//            this@c1,
//            R.layout.item_new_2,
//            blanklist
//        )

        var myadapter = Adapter_page3(this@Page_3, blanklist)

        mylist2.adapter = myadapter
    }
}