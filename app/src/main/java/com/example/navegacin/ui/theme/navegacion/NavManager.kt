import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.navegacin.ui.theme.navegacion.Act03View
import com.example.navegacin.ui.theme.navegacion.EdadModel
import com.example.navegacin.ui.theme.navegacion.ResultadoView
import kotlinx.serialization.Serializable

@SuppressLint("MissingSerializableAnnotation")
@Serializable
object Act03

@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Act03) {

        composable<Act03> {
            Act03View(navController)
        }

        composable<EdadModel> {
            val datos: EdadModel = it.toRoute()
            ResultadoView(datos, navController)
        }
    }
}