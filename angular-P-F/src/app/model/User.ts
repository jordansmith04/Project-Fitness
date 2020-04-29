export class User{

    private id:number; 
    private username:string;
    private password:string;
    private age:number;
    private height:number;
    private weight:number;

    constructor(id:number, username:string, password:string, age:number, height:number, weight:number){
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public getId():number{
        return this.id;
    }

    public setId(id:number){
        this.id = id;
    }

    public getUsername():string{
        return this.username;
    }

    public setUsername(username:string){
        this.username = username;
    }

    public getPassword():string{
        return this.password;
    }

    public setPassword(password:string){
        this.password = password;
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
