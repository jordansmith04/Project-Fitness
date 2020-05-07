import { User } from './user';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
describe('User', ()=> {
    it ('should create an instance of User', ()=>{
        expect(new User('','',null,null,null)).toBeTruthy;
    })
})
it('should accept values',() => {
   // let U = new User('','',0,0,0);
   let m = new User (
        "kgsmith",
        "adfa",
         22,
        55,
         180,)
    
    expect(m.username).toEqual("kgsmith");
    expect(m.pass).toEqual("adfa");
    expect(m.ages).toEqual(22);
    expect(m.height).toEqual(55);
    expect(m.weight).toEqual(180);
    
})