#language: es

  @Historia
    Característica: Verificar los formularios de Color lib
      Yo como usuario quiero llenar los formularios para validar la informacion en color lib
    @Caso1
    Escenario: Verificar el diligenciamiento exitoso
      Dado que actor ingresa a color lib
      Cuando busca el formulario Block Validation
      Y lo diligencia de manera correcta
      Entonces Verifica que se completaron correctamente