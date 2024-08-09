import BaseController from 'controller/BaseController';
import EndPoints from 'controller/EndPoints';
import Metadata from 'controller/Metadata';

class BaseDomeBuilder{
    async getLotosList(){
       let lotos = await BaseController.request(EndPoints.LOTO,Metadata.GET) 
       return lotos;
    }

    print(){console.log("Text")}
    
}
export default BaseDomeBuilder;