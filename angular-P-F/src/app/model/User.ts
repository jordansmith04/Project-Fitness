export class User{

    // private id:number; 
    private username:string;
    private pass:string;
    private age:number;
    private height:number;
    private weight:number;

    constructor(username:string, pass:string, age:number, height:number, weight:number){
        // this.id = id;
        this.username = username;
        this.pass = pass;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // public getId():number{
    //     return this.id;
    // }

    // public setId(id:number){
    //     this.id = id;
    // }

    public getUsername():string{
        return this.username;
    }

    public setUsername(username:string){
        this.username = username;
    }

    public getPass():string{
        return this.pass;
    }

    public setPass(pass:string){
        this.pass = pass;
    }

    public getAge():number{
        return this.age;
    }

    public setAge(age:number){
        this.age = age;
    }

    public getHeight():number{
        return this.height;
    }

    public setHeight(height:number){
        this.height = height;
    }

    public getWeight():number{
        return this.weight;
    }

    public setWeight(weight:number){
        this.weight = weight;
    }
}
