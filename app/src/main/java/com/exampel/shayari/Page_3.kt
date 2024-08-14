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

    var Pagli = arrayOf(
        "तेरी मुस्कान से ही शुरू होती है मेरी हर सुबह।",
        "चुपके से आकर इस दिल में उतर जाते हो, तुम पगली।",
        "तेरे बिना अधूरी सी लगती है ये जिंदगी।",
        "तेरी यादों की खुशबू हर वक्त साथ रहती है।",
        "तेरी हँसी मेरी सबसे बड़ी कमजोरी है।",
        "तेरे बिना हर लम्हा उदास सा लगता है।",
        "तेरी मुस्कान से ही रोशन है मेरी दुनिया।",
        "तू जो मिले तो दुनिया से बेखबर हो जाता हूँ।",
        "तेरी हँसी से दिल का हर दर्द छिपा लेता हूँ।",
        "तेरे बिना ये दिल वीरान सा लगता है।",
        "तेरी आँखों में बसने का सपना देखता हूँ।",
        "तेरी एक झलक पाने को दिल बेताब रहता है।",
        "तेरी खुशबू से महकता है मेरा ये दिल।",
        "तेरी यादों में ही खोया रहता हूँ हर वक्त।",
        "तेरी बातें सुनने के लिए दिल हमेशा बेताब रहता है।",
        "तेरी तस्वीर दिल के करीब रखता हूँ।",
        "तेरी यादें ही मेरे दिन का सबसे हसीन हिस्सा हैं।"
    )

    var Dhokha = arrayOf(
        "जिससे उम्मीदें थीं, वही धोखा दे गया।",
        "दिल को तोड़ा उसने और मुस्कराकर चल दी।",
        "सच्चाई की राह पर चलकर बस धोखा ही मिला।",
        "दिल तोड़ने वालों से मोहब्बत भी मत करना।",
        "वफ़ा की उम्मीद थी, मगर धोखा मिला।",
        "किसी ने हँसकर धोखा दिया, किसी ने रोकर।",
        "धोखा खाने के बाद ही असली चेहरे नजर आते हैं।",
        "धोखे के बाद भी हमने उसे याद किया।",
        "दिल की बात कह दी, और बदले में धोखा पाया।",
        "जिसे अपना समझा, उसने ही धोखा दिया।",
        "धोखा खाया फिर भी दिल उसी का दीवाना रहा।",
        "जिसे सब कुछ माना, उसी ने धोखा दिया।",
        "धोखा देने वालों से शिकायत भी क्या करना।",
        "दिल तोड़कर भी वो बेफिक्र चला गया।",
        "धोखे की दुनिया में वफ़ा ढूँढ रहे थे।",
        "धोखा खाया, फिर भी दिल उसी के पीछे भागा।",
        "जिस पर भरोसा किया, उसने ही धोखा दिया।",
    )

    var Dosti = arrayOf(
        "दोस्ती वो नहीं जो जान ले, दोस्ती वो है जो जान दे।",
        "सच्ची दोस्ती उम्रभर साथ रहती है।",
        "तेरी दोस्ती मेरी जिंदगी का सबसे बड़ा तोहफा है।",
        "दोस्त वो हैं, जो हँसते हुए भी दर्द समझ लें।",
        "दोस्ती की स्याही से लिखी है दिल की किताब।",
        "सच्चे दोस्त वही हैं, जो हर वक्त साथ खड़े हों।",
        "दोस्ती का हाथ कभी मत छोड़ना, चाहे हालात जैसे भी हों।",
        "दोस्ती की दास्तान कभी खत्म नहीं होती।",
        "दोस्त वो हैं, जो बिना कहे समझ जाते हैं।",
        "दोस्ती का रिश्ता दिल से जुड़ा होता है।",
        "दोस्ती वो नहीं जो सिर्फ वक्त गुजारे, दोस्ती वो है जो जिंदगी बनाए।",
        "दोस्त वो है, जो आपकी खामियों को भी अपनाए।",
        "सच्चे दोस्त कभी दूर नहीं होते।",
        "दोस्ती का असली मतलब मुश्किल वक्त में साथ होना है।",
        "दोस्तों के बिना जिंदगी अधूरी है।",
        "दोस्ती का रिश्ता सबसे प्यारा होता है।",
        "दोस्तों के साथ बिताया हर लम्हा खास होता है।",
        "सच्चे दोस्त वही हैं, जो बिना किसी शर्त के साथ देते हैं।"
    )

    var Facebook = arrayOf(
        "फेसबुक पर लाइक्स से ज्यादा तेरी मुस्कान चाहिए।",
        "तेरी प्रोफाइल पिक्चर दिल धड़काती है।",
        "फेसबुक पर तेरे स्टेटस का इंतजार रहता है।",
        "तेरे कमेंट्स ने मेरे दिन को खास बना दिया।",
        "तेरे हर पोस्ट पर दिल देता हूँ।",
        "फेसबुक पर तेरा नाम देखना दिल को सुकून देता है।",
        "तेरी फ्रेंड लिस्ट में शामिल होना मेरा सौभाग्य है।",
        "तेरे हर मैसेज का इंतजार रहता है।",
        "फेसबुक पर तेरी पोस्ट को देखकर ही दिन की शुरुआत होती है।",
        "तेरी प्रोफाइल पिक्चर देखकर दिल खुश हो जाता है।",
        "तेरे स्टेटस में हमेशा कुछ खास होता है।",
        "तेरे साथ की चैट्स मेरे लिए सबसे हसीन पल हैं।",
        "फेसबुक पर तुझसे जुड़ना, दिल को सुकून देता है।",
        "तेरी पोस्ट में एक अलग ही जादू है।",
        "फेसबुक पर तेरा स्टेटस पढ़कर दिल खुश हो जाता है।",
        "तेरे लाइक से हर पोस्ट की कीमत बढ़ जाती है।",
        "तेरी फ्रेंडशिप रिक्वेस्ट ने मेरी दुनिया बदल दी।",
        "फेसबुक पर तेरी यादों के साथ वक्त बिताना अच्छा लगता है।",
        "तेरे हर मैसेज में एक खास एहसास होता है।",
        "फेसबुक पर तेरे साथ बिताए पल सबसे खास हैं।"
    )

    var Funny = arrayOf(
        "दिमाग का कोई इलाज नहीं है, वॉट्सऐप पे ही चलो दिल को बहलाते हैं।",
        "दिल से चाहा था आपको, लेकिन क्या करें, पेट ने ज्यादा जोर मारा।",
        "इश्क में लोग जान तक दे देते हैं, और एक हम हैं जो प्यार में चाय तक नहीं पिला पाते।",
        "जो कहते थे कभी पिज्जा नहीं खाएंगे, आज वो कह रहे हैं डाइटिंग कर रहे हैं।",
        "तेरे प्यार में इतना रोए हैं, जितना बारिश में भी नहीं भीगे थे।",
        "दिल तो बच्चा है जी, लेकिन जेब में पैसे नहीं हैं।",
        "रातों को नींद नहीं आती, क्योंकि व्हाट्सऐप की चैट लंबी है।",
        "हमसे कभी मत कहना कि तुम्हें छोड़ देंगे, क्योंकि भूलने में हमें बहुत वक्त लगता है।",
        "मोहब्बत के बाद सिर्फ दो चीजें बचती हैं – यादें और मोबाइल चार्जर।",
        "तू है दिल की धड़कन, पर पेट की भूख कुछ और ही कहती है।",
        "प्यार में कोई सजा नहीं है, लेकिन बीवी के साथ शॉपिंग कराना सबसे बड़ी सजा है।",
        "इश्क में दर्द है, लेकिन दर्द में दवा भी मिल जाती है।",
        "जो प्यार में रोते हैं, वो डॉक्टर से आँखों की दवा भी ले लेते हैं।",
        "इश्क का नशा शराब से कम नहीं, पर सुबह होने पर सिरदर्द भी होता है।",
        "तू मस्त है, पर तेरी यादें कचरा जैसा दिमाग भर देती हैं।",
        "मोहब्बत में धोखा मिला, अब किसी और के साथ चाय पीते हैं।",
        "प्यार में दर्द है, पर दर्द में प्यार नहीं।",
        "दिल से खेलो, लेकिन स्मार्टफोन से नहीं।",
        "तेरी यादें तो मस्त हैं, पर भूख लगते ही सब भूल जाता हूँ।",
        "मोहब्बत का मौसम आया और चला गया, हम वेटर की तरह टिप का इंतजार करते रह गए।"
    )

    var Love = arrayOf(
        "तेरे बिना दिल लगता नहीं, तेरे साथ जीना है बस यही ख्वाहिश है।",
        "तेरी मुस्कान से ही दिन की शुरुआत होती है।",
        "प्यार की दुनिया में तू मेरा सबसे हसीन ख्वाब है।",
        "दिल की धड़कन में बस तू ही बस गया है।",
        "तेरे बिना हर खुशी अधूरी सी लगती है।",
        "तू ही मेरा आज है, तू ही मेरा कल है।",
        "तेरे प्यार में खो जाना ही मेरे दिल का सबसे बड़ा सपना है।",
        "तेरे बिना जीना जैसे सूरज बिना दिन हो।",
        "तेरे साथ बिताए पल मेरे दिल की सबसे बड़ी धरोहर हैं।",
        "तेरे प्यार में दिल खुद को खो बैठता है।",
        "तेरी आँखों की चमक से दिल को सुकून मिलता है।",
        "तेरे बिना मेरी ज़िंदगी जैसे सुनी और वीरान है।",
        "तू ही वो खुशी है, जो हर दर्द को मिटा देती है।",
        "तेरे साथ बिताया हर लम्हा अनमोल है।",
        "तेरे प्यार की खुशबू से हर सुबह महक उठती है।",
        "तेरे बिना मेरे ख्वाब भी अधूरे हैं।",
        "तेरे बिना मेरी जिंदगी की कहानी अधूरी है।",
        "तेरे साथ बिताया हर पल जैसे किसी हसीन ख्वाब की तरह है।",
        "तेरे प्यार में खुद को खोकर सुकून मिलता है।",
        "तेरे साथ जीने का ख्वाब हर दिन आँखों में सजाए रखता हूँ।"
    )

    var Mohabbat = arrayOf(
        "मोहब्बत का सफर इतना आसान नहीं, हर लम्हा एक नई राह पर ले जाता है।",
        "तेरी मोहब्बत में खुद को खोकर सुकून मिलता है।",
        "मोहब्बत की किताब में, तेरा नाम सबसे सुंदर chapter है।",
        "तेरे बिना मोहब्बत का एहसास अधूरा सा लगता है।",
        "मोहब्बत का यही सच है, दिल की धड़कनें सिर्फ तेरा नाम लेती हैं।",
        "तेरे बिना मोहब्बत का मतलब समझना मुश्किल है।",
        "मोहब्बत की रौशनी से ही दिल की हर अंधेरी रात गुजरती है।",
        "तेरे प्यार में खो जाना ही मेरे दिल की सबसे बड़ी चाहत है।",
        "मोहब्बत में जो दर्द है, वही सच्ची मोहब्बत की पहचान है।",
        "तेरे बिना मोहब्बत का ख्वाब भी अधूरा लगता है।",
        "मोहब्बत का एहसास दिल को हमेशा सुकून देता है।",
        "तेरे बिना मोहब्बत की हर शाम सुनी लगती है।",
        "मोहब्बत में खुद को खो देना ही सबसे हसीन बात है।",
        "तेरे प्यार की खुशबू से दिल महक उठता है।",
        "मोहब्बत का सफर शुरू हुआ था, अब तो यही मंजिल है।",
        "तेरी मोहब्बत में ही दिल को सच्चा सुकून मिलता है।",
        "मोहब्बत के बिना ज़िंदगी एक अधूरी कहानी लगती है।",
        "तेरे प्यार में खुद को खोकर सब कुछ भुला देता हूँ।",
        "मोहब्बत की राह पर हर दर्द की कीमत चुकानी पड़ती है।",
        "तेरे बिना मोहब्बत की दुनिया वीरान सी लगती है।"
    )

    var Prem = arrayOf(
        "प्रेम की भाषा बिना शब्दों के भी समझी जाती है।",
        "तेरे प्रेम में खोकर हर दिन एक नया एहसास मिलता है।",
        "प्रेम का रंग हर दिल को छू जाता है।",
        "तेरे प्रेम में ही दिल को सुकून मिलता है।",
        "प्रेम की गहराइयों में हर दर्द भी मधुर लगता है।",
        "तेरे प्रेम से ही जीवन की हर सुबह हसीन लगती है।",
        "प्रेम में खुद को खो देना ही सबसे सुंदर एहसास है।",
        "तेरे बिना प्रेम का अहसास अधूरा सा लगता है।",
        "प्रेम की खुशबू से दिल हर वक्त महकता है।",
        "तेरे प्रेम में हर लम्हा खास बन जाता है।",
        "प्रेम में बिताए पल यादों में हमेशा बसी रहती हैं।",
        "तेरे प्रेम में जीना, जैसे हर दिन एक नया उत्सव है।",
        "प्रेम की राह पर हर मुश्किल आसान लगती है।",
        "तेरे प्रेम में ही दिल को सबसे बड़ा सुख मिलता है।",
        "प्रेम की मिठास से हर दर्द दूर हो जाता है।",
        "तेरे बिना प्रेम का हर ख्वाब अधूरा लगता है।",
        "प्रेम की गहराई में दिल को सच्चा सुकून मिलता है।",
        "तेरे प्रेम में हर दिन एक नई कहानी बन जाती है।",
        "प्रेम के बिना जीवन की यात्रा अधूरी लगती है।",
        "तेरे प्रेम से ही हर सुबह का आगाज़ खास होता है।"
    )

    var Dard = arrayOf(
        "दर्द की इस शाम में, सिर्फ तेरा नाम ही बाकी रह जाता है।",
        "दिल के दर्द को छुपाने का तरीका भी अब आदत बन गया है।",
        "दर्द की इस गहराई में, खुद को भी खो बैठा हूँ।",
        "तुमसे मिले दर्द ने हमें सबक सिखा दिया है।",
        "दर्द की चुप्पी में, हर ख्वाब चुप रहता है।",
        "दिल का दर्द आँखों से बयां हो जाता है।",
        "दर्द की आदत भी अब एक हिस्सा बन गई है।",
        "तुमसे मिले दर्द ने जीने का तरीका बदल दिया।",
        "दर्द के इस सफर में, हर दिन नया सवाल उठता है।",
        "दिल के दर्द को शब्दों में ढालना अब मुश्किल हो गया है।",
        "दर्द में जीना ही अब हमारी आदत बन गई है।",
        "तेरे बिना दिल का दर्द खत्म नहीं होता।",
        "दर्द के इस समंदर में खुद को भी डूबता पाया।",
        "दिल के जख्म भी अब पुरानी कहानी लगते हैं।",
        "दर्द की गहराइयों में खुद को भी खो बैठा हूँ।",
        "हर दर्द के पीछे एक नई कहानी छिपी होती है।",
        "दर्द की धड़कनें दिल में हमेशा गूंजती हैं।",
        "तुम्हारे जाने के बाद दर्द ने घर बना लिया।",
        "दर्द की इस दुनिया में खुद को भी ढूंढना मुश्किल हो गया है।",
        "हर दर्द की एक नई पहचान बन गई है।"
    )

    var Pyar = arrayOf(
        "तेरे प्यार में खोकर हर दिन हसीन बन जाता है।",
        "प्यार की चमक से दिल हर सुबह महक उठता है।",
        "तेरे बिना प्यार की दुनिया अधूरी लगती है।",
        "प्यार का एहसास दिल को सुकून देता है।",
        "तेरे प्यार में ही दिल को सच्चा सुख मिलता है।",
        "प्यार की हर बात दिल को छू जाती है।",
        "तेरे बिना प्यार का ख्वाब भी अधूरा लगता है।",
        "प्यार में खुद को खो देना ही सबसे सुंदर एहसास है।",
        "तेरे प्यार से ही दिल को चैन मिलता है।",
        "प्यार की मिठास से हर दर्द दूर हो जाता है।",
        "तेरे बिना प्यार का हर पल सुना लगता है।",
        "प्यार की गहराई में दिल को सच्चा सुकून मिलता है।",
        "तेरे प्यार की खुशबू से हर दिन खास बन जाता है।",
        "प्यार में बिताए पल यादों में हमेशा बसे रहते हैं।",
        "तेरे प्यार में जीना, जैसे हर दिन एक नई शुरुआत है।",
        "प्यार की राह पर हर मुश्किल आसान लगती है।",
        "तेरे प्यार के बिना हर ख्वाब अधूरा लगता है।",
        "प्यार की दुनिया में खुद को खोकर जीना ही सच्चा सुख है।",
        "तेरे बिना प्यार की हर बात अधूरी लगती है।",
        "प्यार की हर लहर दिल को छू जाती है।"
    )

    var Romantic = arrayOf(
        "तेरे साथ बिताए हर पल दिल को छू जाता है।",
        "तेरे बिना मेरी दुनिया अधूरी सी लगती है।",
        "तेरे प्यार की चमक से मेरी रातें भी रौशन हो जाती हैं।",
        "तेरी मुस्कान से दिल को सुकून मिलता है।",
        "तेरे बिना हर ख्वाब अधूरा लगता है।",
        "तेरे प्यार में हर दिन एक नया एहसास होता है।",
        "तेरे बिना दिल की धड़कनें भी अधूरी लगती हैं।",
        "तेरे साथ हर लम्हा जादू से भर जाता है।",
        "तेरे प्यार से ही दिल को सच्चा सुकून मिलता है।",
        "तेरे बिना ज़िंदगी जैसे एक लंबी रात हो।",
        "तेरे साथ बिताए हर पल एक हसीन ख्वाब की तरह है।",
        "तेरे प्यार में खोकर सब कुछ भूल जाता हूँ।",
        "तेरे बिना दिल का हर कोना सुनसान लगता है।",
        "तेरे साथ बिताए पल, दिल की सबसे बड़ी धरोहर हैं।",
        "तेरे प्यार की खुशबू से हर सुबह खास बन जाती है।",
        "तेरे बिना हर खुशी अधूरी लगती है।",
        "तेरे प्यार में खुद को खो देना ही सबसे बड़ा सुख है।",
        "तेरे बिना दिल का हर ख्वाब अधूरा लगता है।",
        "तेरे प्यार की वजह से हर लम्हा खास बन जाता है।",
        "तेरे बिना हर दिन जैसे एक सूना सा शहर हो।"
    )

    var Royal = arrayOf(
        "शाही अंदाज में जीना, मेरी आदत बन गई है।",
        "शाही ठाठ से दिल को सुकून मिलता है।",
        "मेरे दिल का हर कोना, राजमहल की तरह है।",
        "शाही जिंदगानी का एहसास, तेरे बिना अधूरा है।",
        "मेरी शाही हर बात, दिल को खास बना देती है।",
        "राजसी ठाठ के बिना दिल का हर ख्वाब अधूरा है।",
        "शाही अंदाज से ही दिल को सुकून मिलता है।",
        "मेरे दिल की शाही दुनिया, सिर्फ तेरे लिए है।",
        "शाही रुतबा और तेरे प्यार का संगम दिल को खास बना देता है।",
        "मेरे दिल का हर ख्वाब, एक राजमहल जैसा लगता है।",
        "शाही ठाठ से दिल की हर बात अद्वितीय लगती है।",
        "तेरे बिना शाही जिंदगानी का रंग फीका सा लगता है।",
        "दिल की शाही दुनिया में तू ही राजा है।",
        "शाही अंदाज में हर पल को जीना, मेरी आदत बन गई है।",
        "तेरे बिना राजसी ठाठ अधूरे से लगते हैं।",
        "शाही जिंदगानी का हर लम्हा तेरे बिना अधूरा है।",
        "तेरे प्यार का शाही रंग दिल को हमेशा महकाता है।",
        "मेरे दिल की शाही दुनिया तेरे बिना सुनी लगती है।",
        "शाही ठाठ से दिल की हर बात खास हो जाती है।",
        "तेरे बिना शाही ठाठ का एहसास अधूरा लगता है।"
    )

    var Whatsapp = arrayOf(
        "दिल की बातें अब सिर्फ WhatsApp पर ही शेयर होती हैं।",
        "व्हाट्सएप पर ही सही, पर हर संदेश दिल से होता है।",
        "तुम्हारे संदेशों से ही दिन की शुरुआत होती है।",
        "WhatsApp की चाट में ही दिल की सारी बातें छुपी हैं।",
        "तुम्हारा हर संदेश, दिल को छू जाता है।",
        "व्हाट्सएप पर भेजे गए हंसते हुए इमोजी दिल को सुकून देते हैं।",
        "व्हाट्सएप पर ही सही, पर तुमसे जुड़ी हर बात खास होती है।",
        "तुम्हारे बिना WhatsApp की हर चैट अधूरी लगती है।",
        "व्हाट्सएप के हर नोटिफिकेशन में तुम्हारी यादें छुपी हैं।",
        "तुम्हारे संदेशों का इंतजार, मेरे दिन की सबसे बड़ी खुशी है।",
        "व्हाट्सएप पर भेजे गए दिल से दिल की बातें हमेशा खास होती हैं।",
        "तुम्हारी बातें और हंसते हुए चेहरे, व्हाट्सएप पर ही सही, दिल को छू जाते हैं।",
        "व्हाट्सएप पर बातें करते-करते दिन कब गुजर जाता है, पता ही नहीं चलता।",
        "तुम्हारा हर संदेश, मेरे दिल की धड़कन बन जाता है।",
        "व्हाट्सएप पर तुम्हारी यादें हमेशा ताजगी से भर देती हैं।",
        "व्हाट्सएप के चैट बॉक्स में, दिल की सारी बातें खुल जाती हैं।",
        "तुम्हारे संदेशों से ही दिल की खामोशी दूर होती है।",
        "व्हाट्सएप पर हर दिन की शुरुआत तुम्हारे संदेश से होती है।",
        "तुम्हारा हर दिल से संदेश, व्हाट्सएप पर मुझे खास बनाता है।",
        "व्हाट्सएप के जरिए ही सही, पर तुम्हारी यादें हमेशा साथ रहती हैं।"
    )

    var Udasi = arrayOf(
        "उदासी की चुप्पी में दिल की आवाजें सुनाई देती हैं।",
        "उदासी के इस सफर में खुद को भी खो बैठा हूँ।",
        "उदासी की इस रात में, ख्वाब भी मायूस हो जाते हैं।",
        "दिल की उदासी को शब्दों में नहीं बांध सकता।",
        "उदासी के इन लम्हों में हर खुशी छुप जाती है।",
        "उदासी की परतों के पीछे छुपी कहानियाँ दिल को चुभ जाती हैं।",
        "उदासी में भी दिल की धड़कनें सुनाई देती हैं।",
        "हर उदासी की वजह एक न एक दिन सामने आ ही जाती है।",
        "उदासी की चुप्पी दिल को और गहराई में ले जाती है।",
        "उदासी की इन राहों पर खुद को भी ढूंढना मुश्किल हो जाता है।",
        "उदासी की इस दुनिया में, खुशी की तलाश अब एक सपना है।",
        "उदासी के हर पल में दिल की आवाजें और भी गहराई से सुनाई देती हैं।",
        "उदासी के बादलों में दिल की रौशनी ढूंढनी पड़ती है।",
        "उदासी का साया दिल पर हमेशा छाया रहता है।",
        "उदासी के इन लम्हों में, उम्मीद की किरणें भी धुंधली लगती हैं।",
        "उदासी की चुप्पी में खुद को भी खो बैठता हूँ।",
        "उदासी की रातें लम्बी लगती हैं, जैसे सुबह कभी न आए।",
        "उदासी की इन गहराइयों में दिल की खामोशी भी छुपी होती है।",
        "उदासी की इन राहों में खुद को भी संजीवनी देना मुश्किल है।",
        "उदासी के इस सफर में उम्मीदों की भी कोई राह नहीं बचती।"
    )

    var Morning = arrayOf(
        "सुबह की किरणें तेरे बिना अधूरी सी लगती हैं।",
        "सुबह की ताजगी तेरे साथ बिताए पल याद दिलाती है।",
        "हर सुबह तेरी यादों का अहसास दिल को ताजगी देता है।",
        "सुबह की रोशनी में तेरे बिना दिल भी सुना लगता है।",
        "सुबह का हर पल, तेरे बिना कुछ भी खास नहीं लगता।",
        "तेरे बिना सुबह की हर हंसी, दिल को अधूरी लगती है।",
        "सुबह की पहली किरण तेरे प्यार की याद दिलाती है।",
        "हर सुबह का आगाज़ तेरे साथ बिताए पल की याद दिलाता है।",
        "सुबह की हवा में तेरे बिना दिल की हर धड़कन अधूरी सी लगती है।",
        "सुबह की चाय में भी तेरे बिना सुकून नहीं मिलता।",
        "सुबह की ताजगी में तेरे बिना दिल की हर खुशी अधूरी है।",
        "सुबह की रोशनी से तेरा प्यार और भी खास लगने लगता है।",
        "तेरे बिना सुबह की हर चिरपिंग दिल को सुनी लगती है।",
        "सुबह की हर खुशबू तेरे प्यार की याद दिलाती है।",
        "सुबह की नींद से जागकर भी दिल को तेरे बिना सुकून नहीं मिलता।",
        "तेरे बिना सुबह का सूरज भी फीका लगता है।",
        "सुबह की हर किरण में तेरे साथ बिताए लम्हों की झलक है।",
        "तेरे बिना सुबह की ताजगी भी दिल को अधूरी लगती है।",
        "सुबह की हंसी में तेरे बिना दिल की हर बात छुपी रहती है।",
        "सुबह की हर धड़कन तेरे बिना अधूरी सी लगती है।"
    )

    var Night = arrayOf(
        "रात की चुप्पी में तेरे ख्वाब ही मेरे साथी बन जाते हैं।",
        "रात की नींद में भी तेरी यादें दिल को तन्हा कर जाती हैं।",
        "रात की चांदनी में, तेरे बिना दिल भी अधूरा सा लगता है।",
        "रात की खामोशी में तेरे बिना हर ख्वाब भी सुनसान लगता है।",
        "रात की तन्हाई में तेरे ख्यालों से दिल को सुकून मिलता है।",
        "रात की गहराई में तेरे बिना दिल की हर धड़कन अधूरी है।",
        "रात की चांदनी तेरे प्यार की याद दिलाती है।",
        "रात की ये खामोशी तेरे बिना दिल को चुप कर देती है।",
        "रात की हर चुप्पी में तेरे बिना दिल भी सूना लगता है।",
        "रात के साए में तेरी यादें ही मेरे सबसे अच्छे साथी हैं।",
        "रात की ये लंबी शामें तेरे बिना सुनी लगती हैं।",
        "रात की हर एक ख्वाब तेरे बिना अधूरी सी लगती है।",
        "रात की तन्हाई में तेरे बिना हर पल बेजान लगता है।",
        "रात की चांदनी में भी तेरे बिना दिल को सुकून नहीं मिलता।",
        "रात की हर खामोशी तेरे बिना दिल की धड़कनों को भी गहरा कर देती है।",
        "रात की रात तेरे बिना जैसे हर ख्वाब भी अधूरा है।",
        "रात की गहराई में तेरे ख्याल ही दिल को गर्मी देते हैं।",
        "रात की चुप्पी में तेरे बिना दिल की धड़कनें भी सुनी लगती हैं।",
        "रात की तन्हाई में, तेरे बिना हर ख्वाब भी सुना लगता है।",
        "रात के अंधेरे में तेरे प्यार की चमक ही दिल को रोशन करती है।"
    )

    var Intjar = arrayOf(
        "तेरे इंतजार की हर घड़ी दिल को और भी मजबूत बना देती है।",
        "इंतजार की राह में हर लम्हा एक नया सवाल बन जाता है।",
        "तेरे इंतजार में बिताए हर पल दिल को और भी बेताब कर देता है।",
        "इंतजार की चुप्पी में दिल की हर धड़कन और भी तेज हो जाती है।",
        "तेरे आने की उम्मीद में हर दिन और भी लंबा लगता है।",
        "इंतजार की हर रात दिल को और भी सुकून देती है।",
        "तेरे इंतजार की हर सुबह एक नई उम्मीद लेकर आती है।",
        "इंतजार के इस सफर में हर दर्द एक नई पहचान बन जाता है।",
        "तेरे बिना इंतजार की हर घड़ी एक सदी जैसी लगती है।",
        "इंतजार की इस दुनिया में हर ख्वाब एक नई उम्मीद बन जाती है।",
        "तेरे इंतजार में हर सुबह की शुरुआत एक नई उम्मीद के साथ होती है।",
        "इंतजार के इस दौर में दिल की धड़कनें और भी बढ़ जाती हैं।",
        "तेरे आने की उम्मीद में हर घड़ी और भी प्यारी लगती है।",
        "इंतजार की हर शाम दिल को और भी तन्हा कर देती है।",
        "तेरे इंतजार की हर सुबह एक नई आशा का संकेत देती है।",
        "इंतजार की इस चुप्पी में दिल की हर खामोशी सुनाई देती है।",
        "तेरे इंतजार की हर रात एक नई उम्मीद लेकर आती है।",
        "इंतजार के इस सफर में दिल की हर बात और भी गहराई से समझ में आती है।",
        "तेरे बिना इंतजार का हर पल एक नई दुआ बन जाता है।",
        "इंतजार की हर घड़ी में दिल को तेरे आने की राह पर नजरें बनी रहती हैं।"
    )

    var Judaay = arrayOf(
        "जुदाई की इस रात में हर ख्वाब अधूरा लगता है।",
        "तेरे बिना जुदाई का हर पल दिल को और भी दर्द दे जाता है।",
        "जुदाई की चुप्पी में दिल की हर आवाज भी खो जाती है।",
        "तेरे बिना जुदाई के हर लम्हे में दिल तन्हा रह जाता है।",
        "जुदाई की इस रात में हर ख्वाब भी बेमहसूस लगता है।",
        "तेरे बिना जुदाई की हर सुबह और भी मायूस लगती है।",
        "जुदाई की राह में हर दर्द एक नई कहानी बन जाता है।",
        "तेरे बिना जुदाई का हर दिन जैसे एक लंबा सफर हो।",
        "जुदाई के इस सफर में दिल की हर धड़कन और भी गहरी हो जाती है।",
        "तेरे बिना जुदाई के हर लम्हे में दिल और भी बेताब हो जाता है।",
        "जुदाई की हर घड़ी दिल को और भी तन्हा कर देती है।",
        "तेरे बिना जुदाई की हर सुबह का आगाज़ और भी उदास होता है।",
        "जुदाई की चुप्पी में दिल की हर खुशी भी चुप हो जाती है।",
        "तेरे बिना जुदाई के हर दिन एक नई कसक लेकर आता है।",
        "जुदाई की इस रात में हर ख्वाब भी तुम्हारे बिना अधूरा लगता है।",
        "तेरे बिना जुदाई के हर पल दिल को और भी गहरा महसूस होता है।",
        "जुदाई के इस सफर में दिल की हर बात और भी गहरी हो जाती है।",
        "तेरे बिना जुदाई की हर शाम दिल को और भी सूना कर देती है।",
        "जुदाई की हर सुबह तुम्हारे बिना दिल की हर खुशी भी अदूरी लगती है।",
        "तेरे बिना जुदाई के इस सफर में हर ख्वाब भी तन्हा हो जाता है।"
    )

    var Painful = arrayOf(
        "दर्द की हर लहर दिल को और भी गहरा महसूस कराती है।",
        "दर्द के इस सफर में खुद को भी खो बैठता हूँ।",
        "हर दर्द की चुप्पी दिल को और भी तन्हा कर देती है।",
        "दर्द की गहराइयों में खुद को भी खो बैठता हूँ।",
        "हर दर्द की रात सुबह की उम्मीद भी चुराती है।",
        "दर्द की इस दुनिया में हर खुशी भी अधूरी लगती है।",
        "दर्द की हर सुबह, दिल को और भी तन्हा कर देती है।",
        "दर्द के हर लम्हे में खुद को भी एक नई कसक महसूस होती है।",
        "हर दर्द की रात, दिल की धड़कनों को भी सुनी कर देती है।",
        "दर्द की इस चुप्पी में हर ख्वाब भी बेमहसूस लगता है।",
        "दर्द के इस सफर में हर सुबह एक नई पीड़ा लेकर आती है।",
        "दर्द की गहराइयों में दिल की हर खुशी भी खो जाती है।",
        "हर दर्द की रात, दिल को और भी गहरा महसूस कराती है।",
        "दर्द के इस सफर में हर लम्हा खुद को और भी बेताब बना देता है।",
        "दर्द की चुप्पी में खुद को भी खो देना एक नई आदत बन जाती है।",
        "हर दर्द की सुबह दिल को और भी मायूस कर देती है।",
        "दर्द की इस चुप्पी में दिल की हर बात भी बेमहसूस हो जाती है।",
        "दर्द के इस सफर में हर खुशी भी एक नई कसक बन जाती है।",
        "दर्द की इस रात में दिल की हर धड़कन भी चुप हो जाती है।",
        "हर दर्द की लहर दिल को और भी गहरा महसूस कराती है।"
    )

    var Gazal = arrayOf(
        "तेरे प्यार की हर लहर में, एक नई गज़ल छुपी होती है।",
        "गज़ल की इन पंक्तियों में, दिल की हर बात बसी है।",
        "तेरे बिना हर गज़ल अधूरी सी लगती है।",
        "गज़ल की दुनिया में तेरे प्यार का रंग हर शेर में बस जाता है।",
        "गज़ल की इस रात में, तेरे ख्यालों की लहरें गूंजती हैं।",
        "हर गज़ल की छांह में, तेरे बिना दिल का हर ख्वाब अधूरा है।",
        "गज़ल की हर एक पंक्ति, तेरे बिना बेअसर सी लगती है।",
        "तेरे बिना गज़ल की हर बात, दिल को सूनी लगती है।",
        "गज़ल की इस दुनिया में, तेरे बिना हर लम्हा अधूरा है।",
        "हर गज़ल की आवाज़ में, तेरे प्यार की गूंज सुनाई देती है।",
        "गज़ल की इन पंक्तियों में, दिल की हर कसक छुपी है।",
        "तेरे बिना गज़ल की हर ख़ुशी भी बेजान लगती है।",
        "गज़ल के इस सफर में, तेरे बिना दिल की हर बात अधूरी सी लगती है।",
        "हर गज़ल की छाँव में, तेरे बिना दिल की हर बात सुनी सी लगती है।",
        "गज़ल की इन रातों में, तेरे बिना दिल भी चुप सा रहता है।",
        "तेरे बिना गज़ल की हर पंक्ति, दिल को खाली कर देती है।",
        "गज़ल के हर शेर में, तेरे प्यार की हर लहर छुपी होती है।",
        "हर गज़ल की आवाज़ दिल को तेरे बिना सुनसान कर देती है।",
        "गज़ल की इन पंक्तियों में, दिल की हर बात तेरे बिना अधूरी है।",
        "तेरे बिना गज़ल की हर बात, दिल को और भी मायूस कर देती है।"
    )

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