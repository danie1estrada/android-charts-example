package daniel.estrada.charts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.charts.Pie
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* --------------------- */
        pieChart2.data = PieData(
            PieDataSet(listOf<PieEntry>(
                PieEntry(160f, "Enviadas"),
                PieEntry(142f, "Cajas en inventario"),
                PieEntry(32f, "Devueltas"),
                PieEntry(11f, "Salidas extraordinarias"),
                PieEntry(18f, "Desechadas"),
                PieEntry(9f, "Perdidas")
            ), "Inventario").apply {
                colors = listOf(
                    Color.parseColor("#5EDCAA"),
                    Color.parseColor("#73BAE9"),
                    Color.parseColor("#FEF7A1"),
                    Color.parseColor("#EFADF3"),
                    Color.parseColor("#F1CAA3"),
                    Color.parseColor("#F9A6A6")
                )
//                yValuePosition = PieDataSet.ValuePosition.OUTSIDE_SLICE
//                xValuePosition = PieDataSet.ValuePosition.OUTSIDE_SLICE
//                valueLinePart1OffsetPercentage = 10f
//                valueLinePart1Length = -0.1f
//                valueLinePart2Length = 0f
//                valueLineColor = Color.TRANSPARENT
                valueTextSize = 14f
            }
        )

        pieChart2.holeRadius = 75f
        pieChart2.setEntryLabelColor(Color.DKGRAY)
        pieChart2.setDrawEntryLabels(false)
        //pieChart2.extraLeftOffset = 25f
        //pieChart2.extraRightOffset = 25f
        pieChart2.invalidate()

    }
}