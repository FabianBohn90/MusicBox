package com.example.musicbox

// ktlint-disable no-wildcard-imports
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // trage die ID des Buttons hier ein
        var playButton = findViewById<ImageButton>(R.id.play_button)
        playButton.setOnClickListener {
            createSongText()
        }
    }

    /**
     * diese Funktion gibt den Wert des ausgewählten RadioButtons zurück
     **/
    fun getGenreFromRadios(): Int {
        // TODO speichere die Id des ausgewählten Genres in einer Variable und gib diese im return
        // Statement zurück
        // nutze hierfür die .checkedRadioButtonId der RadioGroup

        return findViewById<RadioGroup>(R.id.radioGroup).checkedRadioButtonId
    }

    /**
     * diese Funktion gibt den Wert des Sliders zurück
     **/
    fun getSongLength(): Float {
        // TODO speichere die Value des Sliders in einer Variable und gib diese im return
        // Statement zurück
        // nutze hierfür die .value des Sliders

        return findViewById<Slider>(R.id.slider).value
    }

    /**
     * Diese Funktion liest die EditText Felder aus und gibt den Wert zurück
     **/
    fun getStringFromInput(): String {
        // TODO speichere die Texteingabe des InputFelds in einer Variable
        //  und gib diese im return Statement zurück
        //  nutze hierfür die .text des Inputfelds (vergiss nicht .toString())

        val textFeld1 = findViewById<EditText>(R.id.text_1).text.toString()
        val textFeld2 = findViewById<EditText>(R.id.text_2).text.toString()
        val textFeld3 = findViewById<EditText>(R.id.text_3).text.toString()

        return "$textFeld1 $textFeld2 $textFeld3"
    }

    /**
     * Diese Funktion  führt Verse und Refrain zusammen und wiederholt je nach songLength
     **/
    fun createSongString(genreVerse: String, genreChorus: String, songLength: Int): String {
        // TODO Füge Verse und Refrain zusammen und wiederhole den Songtext (songLength) - mal
        // mittels .repeat(ANZAHL) kann ein String wiederholt werden

        // TODO speichere einen zusammengesetzten String in einer Variable und gib dies
        //  im return Statement zurück
        //  der String setzt sich wie folgt zusammen (verse + chorus.repeat(3)).repeat(length)
        //  mittels .repeat(Int) lässt sich ein String wiederholen

        return genreVerse + genreChorus.repeat(3).repeat(songLength)
    }

    /**
     * diese Funktion führ die vorher implementierten Funktionen aus, um die Infos asuzulesen und zusammenzuführen
     * Außerdem wird der erstellte songString in der entsprechenden View dargestellt
     **/
    fun createSongText() {

        // TODO Lese die Textfelder aus und speichere die Strings in  Variablen

        // TODO Lese das Genre aus speichere den String in einer Variable
        //  (getGenreFromRadios())
        val genre = getGenreFromRadios()

        // TODO Lese die Songlänge aus speichere den Integer in einer Variable
        //  (getSongLength())
        val songLeange = getSongLength().toInt()

        // TODO speichere je nach Genre die richtigen Strings in Variablen für verse und chorus
        //  erstelle hierfür eine when Bedingung und lade je nach RadioButtonId die richtigen Strings mittels getString(STRINGID)

        var verse = ""
        var chorus = ""

        when (genre) {
            R.id.radioButton_pop -> {
                verse = getString(R.string.pop_verse)
                chorus = getString(R.string.pop_chorus)
            }
            R.id.radioButton_volk -> {
                verse = getString(R.string.folk_verse)
                chorus = getString(R.string.folk_chorus)
            }
            R.id.radioButton_rap -> {
                verse = getString(R.string.rap_verse)
                chorus = getString(R.string.rap_chorus)
            }
        }

        // TODO nun kannst du createSongString mit verse, chorus und length füttern und das
        // Ergebniss in einer Variable speichern
        // createSongString()

        val fertigerSong = createSongString(verse ,chorus ,songLeange) +  getStringFromInput()

        // TODO zu guter letzt setze die .text deiner Ausgabe TextView auf den den SongString

        findViewById<TextView>(R.id.textView4).text = fertigerSong

        // nutzte <TextView>.setMovementMethod(ScrollingMovementMethod()), um TextView scrollable zu machen
        // Achtung: im Layout  muss folgendes in der Textview enthalten sein
        //        android:scaleType="fitXY"
        //        android:scrollbars="vertical"
    }
}
