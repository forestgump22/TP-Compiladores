; ModuleID = 'ej2.expr'
source_filename = "ej2.expr"

@0 = private unnamed_addr constant [13 x i8] c"a es igual: \00", align 1
@1 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1
@2 = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@3 = private unnamed_addr constant [13 x i8] c"b es igual: \00", align 1
@4 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1
@5 = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@6 = private unnamed_addr constant [16 x i8] c"10 es mayor a 1\00", align 1
@7 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1
@8 = private unnamed_addr constant [19 x i8] c"10 no es mayor a 1\00", align 1
@9 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1

define i32 @language() {
language.0:
  %a = alloca i32, align 4
  store i32 9, ptr %a, align 4
  %b = alloca i32, align 4
  store i32 16, ptr %b, align 4
  %b1 = load i32, ptr %b, align 4
  %addtmp = add i32 5, %b1
  store i32 %addtmp, ptr %a, align 4
  %0 = call i32 (ptr, ...) @printf(ptr @1, ptr @0)
  %a2 = load i32, ptr %a, align 4
  %1 = call i32 (ptr, ...) @printf(ptr @2, i32 %a2)
  %2 = call i32 (ptr, ...) @printf(ptr @4, ptr @3)
  %b3 = load i32, ptr %b, align 4
  %subtmp = sub i32 %b3, -1
  %3 = call i32 (ptr, ...) @printf(ptr @5, i32 %subtmp)
  br i1 true, label %then, label %else

then:                                             ; preds = %language.0
  %4 = call i32 (ptr, ...) @printf(ptr @7, ptr @6)
  br label %merge

else:                                             ; preds = %language.0
  %5 = call i32 (ptr, ...) @printf(ptr @9, ptr @8)
  br label %merge

merge:                                            ; preds = %else, %then
  ret i32 0
}

declare i32 @printf(ptr, ...)

define i32 @main() {
entry:
  %0 = call i32 @language()
  ret i32 0
}
