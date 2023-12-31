package kotlinf.pws.sixthPW

import dagger.Component
import kotlinf.pws.sixthPW.views.MenuBuilder

@Component(modules = [Binder::class])
interface AppComponent {
    fun getMenu(): MenuBuilder
}