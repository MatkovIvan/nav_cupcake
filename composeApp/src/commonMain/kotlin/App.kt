import androidx.compose.runtime.Composable
import com.matkovivan.nav_cupcake.CupcakeApp
import com.matkovivan.nav_cupcake.ui.theme.CupcakeTheme
import com.matkovivan.nav_cupcake.withViewModelStoreOwner

@Composable
fun App() = withViewModelStoreOwner {
    CupcakeTheme {
        CupcakeApp()
    }
}
