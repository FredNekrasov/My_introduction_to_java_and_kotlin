package kotlinf.pws.sixthPW

import dagger.Binds
import dagger.Module
import kotlinf.pws.sixthPW.dataVerification.*
import kotlinf.pws.sixthPW.database.*
import kotlinf.pws.sixthPW.printingData.*
import kotlinf.pws.sixthPW.views.*

@Module
interface Binder {
    @Binds
    fun bindDatabase(db: Database): IOperations
    @Binds
    fun bindPrinter(printer: Print): IPrintList
    @Binds
    fun bindCheckPW(pw: CheckPW): IPW
    @Binds
    fun bindCheckStudent(student: CheckStudent): IStudent
    @Binds
    fun bindCheckVariant(variant: CheckVariant): IVariant
    @Binds
    fun bindCheckLVL(lvl: CheckLVL): ILvl
    @Binds
    fun bindCheckDate(date: CheckDate): IDate
    @Binds
    fun bindCheckMark(mark: CheckMark): IMark
    @Binds
    fun bindExecutor(executor: Executor): IExecutor
}